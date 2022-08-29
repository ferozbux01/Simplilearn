package oops;

public class HierarchicalInheritance {
public static void main(String[] args) {
	science obj=new science();
	maths obj1=new maths();
	english obj2=new english();
	obj.dis();
	obj1.dis();
	obj2.dis();
}
}
class Studentss{
	String name= "Rohan";
	int rollNo=24;
}
class science extends Studentss
{
	int marks = 98;
	void dis(){
		System.out.println("name = "+name +"\nRoll Number = " + rollNo + "\nMarks = " + marks);
	}
}
class maths extends Studentss
{
	int marks = 99;
	void dis(){
		System.out.println("name = "+name +"\nRoll Number = " + rollNo + "\nMarks = " + marks);
	}
}
class english extends Studentss
{
	int marks = 100;
	void dis(){
		System.out.println("name = "+name +"\nRoll Number = " + rollNo + "\nMarks = " + marks);
	}
}
