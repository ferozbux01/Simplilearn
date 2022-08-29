package oops;

public class AbstractExample {

	public static void main(String[] args) {
		india obj=new india();
		obj.display();
		System.out.println(obj.a);
	}

}
abstract class greet{
	String a="greet";
	abstract String wayTo();
}
class india extends greet{
	String a="India";
	String wayTo() {
		String greeting = "Namaste";
		return greeting;
	}
	
	void display()
	{
		String greet= wayTo();
		System.out.println(greet);
	}
}