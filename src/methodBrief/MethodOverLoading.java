package methodBrief;

public class MethodOverLoading {
	public static void main(String[] args) {
		overload1 b=new overload1();
		int sum = b.add(1,2);
		System.out.println("Sum = " + sum);
		int sum1 = b.add(1,2,3);
		System.out.println("Sum = " + sum1);
		int sum2 = b.add(1,2,3,4);
		System.out.println("Sum = " + sum2);
		}

}
class overload1{
int sum,a,b,c,d;
	int add(int a, int b){
	sum = a+b;
	return sum;
	}
int add(int a, int b, int c){
	sum = a+b+c;
	return sum;
}
int add(int a, int b, int c, int d){
	sum = a+b+c+d;
	return sum;
}
}
