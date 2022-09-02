package exception;

import java.util.Scanner;

public class CustomExceptionExample {

public static void main(String[] args) {
	SalaryCheck obj = new SalaryCheck();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your salary");
	int sal = sc.nextInt();
	try {
	obj.check(sal);
	}
	catch(Exception m){
		System.out.println("Exception: " + m.getMessage());
	}
}
}


class SalaryCheck{
	void check(int salary)  throws SalaryException{
		if (salary < 2100)
		{
			throw new SalaryException("You need to work hard");
		}
		else if (salary >2100 && salary<5000)
		{
			throw new SalaryException("Your Salary is somehow Good");
		}
		else if (salary >5100 && salary <9000)
		{
			throw new SalaryException("Salary is good");
		}
		else {
			System.out.println("You have a very good salary   ");
		}
	}
}

class SalaryException extends Exception{
	SalaryException(String n){
		super(n);
	}
}
