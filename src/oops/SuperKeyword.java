package oops;

public class SuperKeyword {
public static void main(String[] args) {
	Dog d=new Dog();
	d.working();
}
}

class Pets{
	int legs = 4;
	void eat() {
		System.out.println("Pet eats food given by their owner");
	}
	Pets(){
		System.out.println("Welcome to Animal Program");
	}
}
class Dog extends Pets{
	int legs = 2;
	void eat() {
		System.out.println("Dogs love to chew bones");
	}
	void bark()
	{
		System.out.println("Dogs Bark");
	}
	void working(){
		super.eat();
		eat();
		bark();
		System.out.println("Dogs have " + super.legs + " legs");
		System.out.println("Humans have "+legs + " legs");
	}
	Dog(){
		super();
	}
}