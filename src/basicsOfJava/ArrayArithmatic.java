package basicsOfJava;
import java.util.*;

public class ArrayArithmatic {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[]=new int[10];
	System.out.println("Enter 10 numbers");
	for(int i = 0; i<10; i++)
	{
		a[i]=sc.nextInt();
	}
	Cal c=new Cal(a);
}

}
class Cal{
	int sum=0;
	int multi=1;
Cal(int a [])
{
	int greater=a[0];
	int lowest=a[0];

	for (int i=0; i<a.length; i++)
	{
		this.sum+=a[i];
		this.multi*=a[i];
		greater = (greater<a[i])?a[i]:greater;
		lowest =(lowest>a[i])?a[i]:lowest;
	}
	System.out.println("Sum = " + sum + "\n Multiplication Result = " + multi +  "\n Greater Number = " + greater + "\n Lowest = " + lowest);
}}