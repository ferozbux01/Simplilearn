package innerClass;

public class MethodLocalInner {
public static void main(String[] args) {
	School obj=new School();
	obj.display();
	obj.dis();
}
}
class School{
	String name="MPS";
	
	void display() {
		System.out.println("The school name is " + name);
	}
	
	void dis(){
		class classes {
			String noOf = "12 classes";
			void print(){
				System.out.println("Total classes = " +noOf);
			}
		}
		classes obj = new classes();
		obj.print();
	}
}