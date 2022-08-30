package oops;

public class Final {
public static void main(String[] args) {
	Parent obj=new Parent();
	obj.display();
}
}
final class Parent {
	final String name = "Ameen";
	int age = 25;
	void display(){
		System.out.println("The name is "+name);
		System.out.println("The age is " +age);
	}
//	void changeName() {
//		this.name="Aman";
//		System.out.println("name has changed to "+name);
//	}
	
}
//class example extends Parent{
//	
//}