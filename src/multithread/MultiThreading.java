package multithread;

public class MultiThreading {

	public static void main(String args[]){
		Train t= new Train();
		TT train1=new TT(t);
		TT train2=new TT(t);
		
		train1.start();
		train2.start();
		
		train1.setName("Train 1");
		train2.setName("Train 2");
		
	}

}

class Train{
	
	synchronized void trainT(){
	for (int i =0; i<3; i++)
	{
	System.out.println(Thread.currentThread().getName() + " time " + i);	
	}
	try {
		Thread.sleep(3000);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	}
class TT extends Thread{
	Train t;
	TT(Train t){
		this.t=t;
	}
	public void run() {
		t.trainT();
	}
}