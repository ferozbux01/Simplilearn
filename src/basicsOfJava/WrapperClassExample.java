package basicsOfJava;
import java.util.stream.IntStream;


public class WrapperClassExample {
public static void main(String[] args) {
	long l=500L;
	int a=70;
	float b=50.30F;
	double d=80.9889798D;
	boolean bo=false;
	System.out.println(" explicit casting ---> longer range to smaller range - Long to int");
	int ni=(int)l;
	System.out.println("Previous Long: " + l);
	System.out.println("Long after explicing casting into integer: " + ni);
	System.out.println("*************************************************");
	System.out.println("implicit casting ---> smaller range to longer range");
	long nl=a;
	System.out.println("Previous integer: " +a);
	System.out.println("Integer after converting to long: " +nl);
	System.out.println("*************************************************");
	System.out.println("Assigning an integer to the object --- Integer Primitive");
	
	Integer ObjInt = a;  // integer primitive ---> Integer object
	
	System.out.println("*************************************************");
	System.out.println("Assigning an object to an Integer --- Integer Primitive");
	
	int obj = Integer.valueOf(ObjInt);
	
	System.out.println("Value of integer after an object is assigned to it: " + obj);
	System.out.println("*************************************************");
	System.out.println("Displaying an array through for loop");
	int arr[]= {1,2,3,4,5,65,6,7,8};
	for (int z:arr)
	{
		System.out.println(" " + z);
	}
	
}
}