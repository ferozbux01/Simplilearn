package exception;

public class SimpleWaitNotify extends Thread{

	public static void main(String[] args) {
		bank b=new bank();
		
		new Thread() {
			public void run() {
				b.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				b.deposit(10000);
			}
		}.start();
	}

}
class bank{
	int bal = 10000;
	synchronized void deposit(int a) {
		bal+=a;
		System.out.println("Amount Deposited\nBalance = "+bal);
		notify();
	}
	synchronized void withdraw(int b) {
		
		if(bal<b) {
			System.out.println("Insufficient Balance  ");
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			bal-=b;
			System.out.println("Withdraw Successful\nBalance = "+bal);
		}
	}
}
