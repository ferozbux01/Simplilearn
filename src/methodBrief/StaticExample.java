package methodBrief;

public class StaticExample {
public static void main(String[] args) {
	Student a=new Student(1, "Ankit");
	Student b=new Student(2, "Amnan");
	Student c=new Student(3, "Akash");
	a.dis();
	b.dis();
	c.dis();
	
	b.change("Graphic Era");
	a.dis();
	b.dis();
	c.dis();
	
	Student.change1("MIT");
	a.dis();
	b.dis();
	c.dis();
}
}

class Student{
	int rollNo;
	String name;
	static String college = "MIS";
	Student (int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	void dis(){
		System.out.println("Roll Number =" + rollNo);
		System.out.println("Name =" + name);
		System.out.println("Colleeege = "+college);
	}
	void change(String n)
	{
	college=n;	
	}
	static {
		System.out.println("Inside the Static Block");
	}
	static void change1(String m)
	{
		System.out.println("Changing the value through Static method");
		college = m;
	}
}
