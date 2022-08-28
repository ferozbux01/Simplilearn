package oops;

public class StaticDemo {
public static void main(String[] args) {
	Emp Rahul=new Emp();
	Emp Alina=new Emp();
	Rahul.eid=7;
	Alina.eid=9;
	Rahul.salary=45000;
	Alina.salary=65000;
	Rahul.CEO = "Vatsalya";
	Alina.CEO = "James";
	Rahul.show();
	Alina.show();
}
}

class Emp{
	int eid;
	int salary;
	static String CEO;
	static {
		CEO="Larry";
	}
	void show(){
		System.out.println("Eid = " +eid+ "\nSalary " + salary + "\nCEO " + CEO);
	}

}
