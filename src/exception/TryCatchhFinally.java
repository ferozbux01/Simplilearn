package exception;

public class TryCatchhFinally {

public static void main(String[] args) {
	new divisions(10,0);
}

}
class divisions{
	
	divisions(int a, int b){
		try {
			int ans = a/b;
			System.out.println("division result = " +ans);
		}
		catch(ArithmeticException as)
		{
			System.out.println(as.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally{
			int sum = a+b;
			System.out.println("Sum result = "+sum);
		}
	}
}