package oops;

public class CompileTimeOrMethodOverridingPolymorphism extends Employee {
	int bonus = 10000;
	public void show() {
		System.out.println("Salary of the employee is "+salary);
		System.out.println("Bonus of the employee is "+bonus);
	}


	public static void main(String[] args) {
		CompileTimeOrMethodOverridingPolymorphism obj=new CompileTimeOrMethodOverridingPolymorphism();
		obj.show();
	}

}
class Employee{
	float salary = 90000F;
	int bonus = 5000;
	public void show() {
		System.out.println("Welcome to Employee Salary. The salary is "+salary);
		System.out.println("The bonus is "+bonus);
	}
}
