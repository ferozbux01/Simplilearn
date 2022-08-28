package oops;

public class ThisConstructor {

public static void main(String[] args) {
	Students s=new Students(10);
}
}

class Students{
	
	Students(int y)
	{
		this();
		System.out.println("The age of the studen is " + y);
	}
	
	Students()
	{
		System.out.println("The student is in class ");
	}

}