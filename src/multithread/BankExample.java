package multithread;
import java.util.*;
public class BankExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose from the menu");
		System.out.println("1-Withdraw");
		System.out.println("2-Deposit");
		System.out.println("3-Check Balance");
		int i=sc.nextInt();
		int amount;
		User n=new User();
		if (i==1) {
			
		}
		else if (i==2) {
			System.out.println("Please enter the amount you want to Withdraw");
			amount=sc.nextInt();
			n.withdraw(amount);
		}
		else if (i==3) {
			System.out.println("Please Enter the amount you want to Deposit");
			amount=sc.nextInt();
			n.deposit(amount);
		}
		else {
			System.out.println("You have Entered a incorrect number");
		}
		User u=new User();
		new Thread(){
			public void run()
			{
				u.withdraw(15000);
			}
			}.start();
			;
		new Thread(){
			public void run() {
				u.deposit(20000);
			}
			}.start();
		}
	}
class User{
	int bal = 10000;
	synchronized void withdraw(int amount) {
		if(bal<amount) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Insufficient Balance");
			System.out.println("Choose From the options");
			System.out.println("1-Wait for deposit");
			System.out.println("2-Exit");
			int c=sc.nextInt();
			if(c==1) {
				try {
					wait();
					
				}
				catch(Exception e) {
					
				}
				bal-=amount;
				System.out.println("Withdraw Complete! \nBalance Left: "+bal);
			}
		}
		else {
			bal-=amount;
			System.out.println("Withdraw Complete! \nBalance Left: "+bal);
		}
	}
	synchronized void deposit(int amount) {
		System.out.print("Depositing the balance");
		for (int i=0;i<5;i++)
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		bal+=amount;
		System.out.println("Withdraw Complete! \nBalance Left: "+bal);
		notify();

	}
	void checkBal() {
		System.out.println("Balance in your account is "+bal);
	}
	
}

