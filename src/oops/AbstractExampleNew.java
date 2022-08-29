package oops;

public class AbstractExampleNew {

	public static void main(String[] args) {
		Honda Obj = new Test();
		Obj.KickAvailable();
		Obj.Starts();
		Obj.NoOfGears();
	}

}
abstract class Bike{
	Bike()
	{
		System.out.println("You have choosen a bike");
	}
	void NoOfGears(){
		System.out.println("No. of gears are 5");
	}
	abstract void Starts();
	
}
abstract class Honda extends Bike{
	Honda(){
		System.out.println("The Brand is Honda");
	}
	abstract void Starts();
	abstract void KickAvailable();
}
class Test extends Honda{
	Test(){
		System.out.println("Testing the features");
	}
	void KickAvailable() {
		System.out.println("The Bike has the Kick");
	}
	void Starts() {
		System.out.println("The Bike Can Start with a power button");
	}
	void Thanks() {
		System.out.println("Thanks for Choosing Us");
	}
}