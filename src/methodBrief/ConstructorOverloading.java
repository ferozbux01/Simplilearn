package methodBrief;

public class ConstructorOverloading {

	public static void main(String[] args) {
		overld a=new overld();
		overld b=new overld(1,2);
		overld c=new overld(1,2,3);
		overld d=new overld(1,2,3,4);
	}

}
class overld{
overld(int a, int b){
	int sum = a+b;
	System.out.println("Sum = " +sum);
		
	}
overld(int a, int b, int c){
	int sum = a+b+c;
	System.out.println("Sum = " +sum);
		
	}
overld(int a, int b, int c, int d){
	int sum = a+b+c+d;
	System.out.println("Sum = " +sum);
}
overld(){
	System.out.println("No Calculation done");
	
}
}
