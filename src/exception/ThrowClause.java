package exception;

public class ThrowClause {


	
	public static void main(String[] args) {
		sum obj=new sum();
		try {
		int result = obj.add(900,500);
			}
		catch(ArithmeticException ae) {
			 m 
		}
		
}
class sum{
	
	static int add(int a, int b) {
		if (a+b>900)
			throw new ArithmeticException("Sum is greater than 900");
		else
			System.out.println("Numbers Under Range");
		return a+b;
	}
}