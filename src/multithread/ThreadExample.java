package multithread;

public class ThreadExample extends Thread {

	public static void main(String[] args) {
		ThreadExample obj= new ThreadExample();
		obj.start();

	}
public void run() {
	System.out.println("Thread is Running");
}
	
}
