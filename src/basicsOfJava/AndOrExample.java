package basicsOfJava;

import java.util.Scanner;

public class AndOrExample {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the three numbers to find if the first number entered is greater than all or if the first number entered is greater than any other number entered");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	Greater g=new Greater();
	boolean result = g.Greater1(a, b, c);
	boolean result1 = g.Greater2(a,b,c);
	System.out.println("A is greater than all: " + result);
	System.out.println("A is greater than any of the two number: " + result1);
	
	}

}
class Greater{
	boolean Greater1(int a, int b, int c){
		boolean result = a>b && a>c;	
		return result;
	}
	boolean Greater2(int a, int b, int c){
		boolean result = a>b || a>c;	
		return result;
	}
	
}