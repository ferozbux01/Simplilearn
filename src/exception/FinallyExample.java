package exception;

import java.util.Scanner;

public class FinallyExample {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter two numbers for division");
			float a = s.nextInt();
			float b = s.nextInt();
			Division d = new Division();
			d.div(a,b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
class Division{
	
	void div(float a, float b){
		try{
			float div = a/b;
		System.out.println("The answer is "+div);
		}
		catch(ArithmeticException a1) {
			System.out.println(a1);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finallly always executed");
		}
	}
}