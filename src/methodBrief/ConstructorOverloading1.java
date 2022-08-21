package methodBrief;

public class ConstructorOverloading1 {

	public static void main(String[] args) {
		overload b=new overload(1,2);
		overload c=new overload(1,2,3);
		overload d=new overload(1,2,3,4);
		b.displaySum();
		c.displaySum();
		d.displaySum();
	}

}
class overload{
int sum,a,b,c,d;
	overload(int a, int b){
	sum = a+b;		
	}
overload(int a, int b, int c){
	sum = a+b+c;
	}
overload(int a, int b, int c, int d){
	sum = a+b+c+d;
}
void displaySum(){
	System.out.println("Total Sum = " + sum);
}
}
