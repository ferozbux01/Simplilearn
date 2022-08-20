
//Write a constructor in the Car class given below that initializes the brand class field with the string “Ford”.
//Call the getBrand() method in the main method of the Constructor class  and store the value of the brand in a variable, and print the value.
package basicsOfJava;
class Car{
	String brand;
	public Car(){
		this.brand="Ford";
		
	}
	public String getBrand(){
		return brand;
		
	}
}

public class Constructor {
public static void main(String[] args) {
	Car Ford=new Car();
	String brand = Ford.getBrand();
	System.out.println(brand);
}
}
