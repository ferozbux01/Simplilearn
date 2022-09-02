package exception;

public class CustomException {

	public static void main(String[] args) {
		ager obj=new ager();
		try {
			obj.validat(14);
		}
		catch(Exception m) {
			System.out.println("Exception Occured " +m.getMessage());

		}
			
	}

}

class ager{
	
	void validat(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("Not a Valid age");
		else
			System.out.println("You can vote");
	}
}
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);	
	}
	
}