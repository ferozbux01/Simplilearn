package multithread;

import java.util.Scanner;

public class SynchronizedExample {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
////		System.out.println("Enter the 2 numbers for which you want the table to run");
////		int a = sc.nextInt();
////		int b= sc.nextInt();
		Table t=new Table();

		Table1 t1=new Table1(t);
		Table1 t2=new Table1(t);
		t1.start();
		t2.start();	
		
	}

}
class Table1 extends Thread{
	Table t;
	Table1(Table t){
		this.t=t;
	}
	public void run(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		t.display(a);
	}
	
}
class Table{
	void display(int a)
	{
		synchronized(this) {
		for (int i=1;i<11; i++)
		{
			System.out.println(a +" X " + i +" = "+(a*i));
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	}
}