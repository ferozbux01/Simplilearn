package multithread;

public class DaemonThread {
public static void main(String[] args) {
	DT o=new DT();
	DT o1=new DT();
	DT o2=new DT();
	DT o3=new DT();
	
	o.setName("Eg1");
	o1.setName("Eg2");
	o2.setName("Eg3");
	o3.setName("Eg4");
	
	o.setPriority(1);
	o1.setPriority(10);
	o2.setPriority(9);
	o3.setPriority(5);
	
	o2.setDaemon(true);
		
		o.start();
		o1.start();
		o2.start();
		o3.start();

	
	
	
}
}
class DT extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Priority " +Thread.currentThread().getName() + "::"+Thread.currentThread().getPriority());
		System.out.println("Stack Trace " +Thread.currentThread().getName()+"::"+Thread.currentThread().getStackTrace());
		System.out.println("Thread Group " +Thread.currentThread().getName()+"::" +Thread.currentThread().getThreadGroup());
		System.out.println("Thread Id " +Thread.currentThread().getName()+"::" +Thread.currentThread().getId());
		System.out.println("Live Status " +Thread.currentThread().getName()+"::"+Thread.currentThread().isAlive());
		System.out.println("Daemon " +Thread.currentThread().getName()+"::"+Thread.currentThread().isDaemon());
	}
	}