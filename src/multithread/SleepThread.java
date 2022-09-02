package multithread;

public class SleepThread {

public static void main(String[] args) {
	threading a= new threading();
	threading b= new threading();
	threading c= new threading();
	
	a.setName("Java");
	b.setName("Python");
	c.setName("C++");
	
	a.setPriority(1);
	b.setPriority(5);
	c.setPriority(10);
	
	a.start();
	b.start();
	c.start();
}
}

class threading extends Thread{
	public void run() {

	for(int i=1;i<5;i++) {
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() +" :" +i);
	}}
}