package methodBrief;

public class PrivateKeyword {
public static void main(String[] args) {
	A obj=new A();
	obj.display1();
	int n = obj.ReturnPrivateValue();
	System.out.println("The Private number is " + n);
}
}
class A{
	private int a = 10;
//	private void display()
//	{
//		System.out.println("The Private number is "+a);
//	}
	void display1() {
		System.out.println("The Private number is "+a);
	}
	int ReturnPrivateValue(){
		return a;
		
	}
}