package oops;

public class BasicAbstractClass {

	public static void main(String[] args) {
		AbstractDemo obj = new basicAbstractExample();
		obj.name();
		obj.anotherMethod();
		basicAbstractExample obj1 = new basicAbstractExample();
		obj1.name();
		obj1.anotherMethod();
		obj1.extraMethod();
	}

}
abstract class AbstractDemo{
	private String name = "Albert";
	AbstractDemo()
	{
		System.out.println("Inside the parent class");
	}
	void name()
	{
		System.out.println(name);
	}
	abstract public void anotherMethod();
}

class basicAbstractExample extends AbstractDemo{
	basicAbstractExample ()
	{
		super();
		System.out.println("Inside the child class Constructor");
	}
	public void anotherMethod() {
		System.out.println("Another Method Successfully concreted");
	}
	public void extraMethod(){
		System.out.println("inside extra method");
	}
}