
package basicsOfJava;
import java.util.*;


class Display {
	int arr1 [][]=new int[4][4];
	public void dis(int arr2 [][]) {
		this.arr1=arr2;
		for(int i=0;i<2;i++) {
			for (int j=0;j<4;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
		}
	}
}

public class Array2D {
	public static void main(String[] args) {
		System.out.println("Program started");
		int arr[][]=new int[4][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 8 numbers");
		for(int i=0;i<2;i++) {
			for (int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array Saved");

		Display a = new Display();
		System.out.println("Object Created");
		a.dis(arr);
		System.out.println("Method Called");
		

	}
}