package oops;

public class SingleInheritance{
	public static void main(String[] args) {
	B obj=new B();	}
}
class A{
	String name = "Harry";
	String Id = "UP1007";
	int salary = 90000;
}
class B extends A{

	B(){
	System.out.println("Name = "+name+ "\nId =" +Id +"\nSalry = "+salary);
}
}