package methodBrief;

import java.util.Scanner;

public class CallByValue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Press 1 for hen and 2 for duck");
	int a=sc.nextInt();
	bird b=new bird();
	String sound = b.birdsound(a);
	System.out.println("Default sound of the bird is " + b.sound);
	System.out.println("Sound of the bird you selected is " + sound);
}
}
class bird{
	String sound = "chee chee";
	String birdsound(int a) {
		String sound1 = (a==1)?"kurukuk" : "kwack kwack";
		return sound1;
	}
}