package oops;

public class InterfaceExample {
public static void main(String[] args) {
	Seats obj = new Showroom();
	obj.brand();
	obj.NoOfSeats();
	Vehicle obj1=new Showroom();
	obj1.Vehicles();
	obj1.Show();
	Showroom obj2 = new Showroom();
	obj2.Vehicles();
	obj2.Show();
	obj2.brand();
	obj2.NoOfSeats();
}
	}

interface Vehicle{
	String vehicleType = "Car";
	void Vehicles();
	void Show();
	}
interface Car{
	void brand();
	}
interface Seats extends Car{
	void NoOfSeats();
	}
class Showroom implements Vehicle, Seats{
	@Override
	public void Vehicles() {
		System.out.println("Type of vehicle is "+vehicleType);
	}
	@Override
	public void Show() {
		System.out.println("The Car is automatic");
		
	}
	@Override
	public void brand() {
		System.out.println("Brand is Tesla");
		
	}
	@Override
	public void NoOfSeats() {
		System.out.println("No. of seats are 5");
		
	}
	
	
	
}