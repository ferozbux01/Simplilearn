package oops;

public class Aggregration {

	Operation obj;   //aggregation  // reference of the class created
	double pi=3.14;
	double area(int radius) {
		obj = new Operation();    // object creation
		double pirsquare = obj.square(radius)*pi;   //code reusability (i.e. delegates the method call).  
		return pirsquare;
	}
	
	public static void main(String[] args) {
	Aggregration a = new Aggregration();
	double result = a.area(5);
	System.out.println(result);
} 
}
class Operation{
	int square(int i) {
		return i*i;
	}
}
