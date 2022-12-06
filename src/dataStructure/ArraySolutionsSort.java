package dataStructure;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySolutionsSort {
public static void main(String[] args) {
	int a []=new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 Numbers");
	for (int i=0;i<10;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for (int j=0;j<10;j++) {
	System.out.println(a[j]);
	}
	System.out.println("Enter the number to be searcher");
	int n=sc.nextInt();
	boolean az=false;
	for (int i=0;i<10;i++)
	{
	if(a[i]==n)
	{
		az=true;
		break;
	}
	}
	String result = (az)? "Number Found in Array" : "Number not found in the array";
	System.out.println(result);
}
}
