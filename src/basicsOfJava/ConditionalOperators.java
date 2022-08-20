package basicsOfJava;

import java.util.Scanner;

class vote{
	vote(int age){
		String result = (age<=18)?"You are not eligible to vote" : "You are eligible to vote";
		System.out.println(result);
	}
}
public class ConditionalOperators {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Your name");
	String name = sc.nextLine();
	System.out.println("Enter your age");
	int age = sc.nextInt();
	System.out.println(name + " here is the result");
	vote t=new vote(age);
	
			
	
}
}
