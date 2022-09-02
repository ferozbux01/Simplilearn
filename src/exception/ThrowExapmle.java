package exception;
import java.io.*;

public class ThrowExapmle {

	public static void main(String[] args) {
		ThrowExapmle obj=new ThrowExapmle();
		obj.p();
		
	}
	
	void m()throws IOException, ClassNotFoundException{
		throw new ArithmeticException("device error");
	}
	void n() throws IOException, ClassNotFoundException{
		m();
	}
	
	
	void p() {
		
		try {
			n();
		}
		catch(Exception e) {
			System.out.println( "Exceptional Handling");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getClass());
		}
		
	}

}
