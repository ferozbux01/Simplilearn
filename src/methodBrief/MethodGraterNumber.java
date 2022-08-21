package methodBrief;

import java.util.Scanner;

public class MethodGraterNumber {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter the two number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int greater = bignumber(a,b);
	System.out.println("Greater Number is " + greater);
}
catch(Exception e){
	System.out.println("Enter a Valid number");
}
}
public static int bignumber(int a,int b) {
	int greater = (a>b)?a:b;
	
	return(greater);
}

}
