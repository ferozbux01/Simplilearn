package basicsOfJava;

import java.util.Scanner;


class ArraySum
{
	int add[][]=new int[2][5];

	public int[][] sum(int a[][],int b[][]) {
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<5;j++)
			{
				this.add[i][j]=a[i][j]+b[i][j];
			}
		}
		return(this.add);
	}

}

public class Array2DSum {
public static void main (String args[])
{
	
	ArraySum s= new ArraySum();
	int a[][]=new int[2][5];
	int b[][]=new int[2][5];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter 10 numbers of Array 1");
	for (int i=0; i<2; i++)
	{
		for (int j=0; j<5; j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the 10 number for the Array 2");
	for(int i=0;i<2;i++) {
		for (int j=0;j<5;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	int sum[][]=s.sum(a,b);
	System.out.println("The Sum of the two Arrays = " );
	for(int i=0;i<2;i++) {
		for (int j=0;j<5;j++)
		{
			System.out.print(sum[i][j] + " ");
		}
	}
	
}
}
