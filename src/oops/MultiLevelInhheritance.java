package oops;

public class MultiLevelInhheritance {
	public static void main(String[] args) {
		D1 obj = new D1();
		obj.display();	
	}
}
class A1{
	String a = "A is inherited";
}
class B1 extends A1{
	String b = "B is inherited";
}
class C1 extends B1{
	String c = "C is inherited";
}
class D1 extends C1{
	String d = "D is ready";
	void display(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
