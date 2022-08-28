package string;

import java.util.*;
public class StringTokenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using Constructor 1 -");
		StringTokenizer st1 = new StringTokenizer("Hello Greeks How are you?", " ");
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		System.out.println("------------------------------------");

		System.out.println("Using Constructor 3 - "); 
		StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :", true); 
		while (st3.hasMoreTokens()) 
			System.out.println(st3.nextToken()); 
		// counting tokens
	    System.out.println("Total tokens : " + st3.countTokens());  
	}

}
