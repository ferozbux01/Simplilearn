package Basics;
import java.util.Scanner;
public class Arthmatic {
public static void main (String args[]) Delete this line
{
	String n;
	int n1, n2, n3;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter your name");
		n = sc.next();
		
		System.out.println("Enter the 3 numbers and press enter after entering each number");
 
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			n3 = sc.nextInt();
	}
	System.out.println(n +" TheSum = " + (n1+n2+n3));

}
}//This is just a comment//
