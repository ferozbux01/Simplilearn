package oops;

public class InterfaceExample2 implements Drawable, Shape{
	static int salary = 90000;
	
	public static void main(String[] args) {
		InterfaceExample2 obj = new InterfaceExample2();
		obj.show();
		obj.shape();
		obj.draw();
		Shape obj2 = new InterfaceExample2();
		obj2.shape();
		obj2.show();
		System.out.println("Salary of mail = " + salary);
		System.out.println("Salary of Shape = " + obj2.salary);
//		System.out.println("Salary of Draw = "+ super.salary);
	}
	@Override
	public void show() {
		System.out.println("Inside Show()");
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Draw()");
	}


	@Override
	public void shape() {
	System.out.println("Inside Shape()");	
	}




}
interface Drawable{
	int salary = 100;
	void draw();
	void show();
}
interface Shape{
	int salary = 200;
	void shape();
	void show();
}