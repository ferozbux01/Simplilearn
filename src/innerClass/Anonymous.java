package innerClass;

import java.util.Scanner;

public class Anonymous {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	int age = sc.nextInt();
	drink obj=new drink(age)
	{
		public void eligible(int age)
		{
			String result = (age >=25)? "You can Drink":"You cannot Drink";
			System.out.println(result);		
			}
};
}
}
class drink{
	drink(int age){
	eligible(age);
	}
	public void eligible(int age)
	{
		String result = (age >=21)? "You can Drink":"You cannot Drink";
		System.out.println(result);	}
}
