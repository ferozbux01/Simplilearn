package oops;

import java.util.Scanner;

public class encaptulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap obj = new encap();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		obj.setName(name);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		obj.setAge(age);
		String id=obj.getId();
		System.out.println("Your id generated is " +id);
		
	}

}
class encap{
	private String name;
	private int age;
	private String id;
	public String getId() {
	String name=this.name;
	int age=this.age;
	int len = name.length();
	System.out.println(len);
	id = name.substring((len-2), (len)) + age;
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
