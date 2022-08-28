package methodBrief;

public class Encaptulation {

	public static void main(String[] args) {
		encap obj=new encap();
		obj.setName("Rahul");
		obj.setRollNo(1);
		obj.setClassName(12);
		obj.setAge(12);
		obj.setSec('c');
		System.out.println("name of the student is " + obj.getName());
		System.out.println("Roll  Number of the student is " + obj.getRollNo());
		System.out.println("Class of the student is "+ obj.getClassName());
		System.out.println("Age of the student is " + obj.getAge());
		System.out.println("Section of the student is " +obj.getSec());
		
	}

}
class encap{
	private String name;
	private int rollNo;
	private int className;
	private int age;
	private char sec;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getClassName() {
		return className;
	}
	public void setClassName(int className) {
		this.className = className;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSec() {
		return sec;
	}
	public void setSec(char sec) {
		this.sec = sec;
	}
	
	
	
	
}
