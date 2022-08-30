package oops;

public class CheckPrimeNumber {

	void CheckPrime(int n) {
	boolean check=false;
		for(int i=2;i<=n/2;i++) {
		if(n%i==0)
		{
			check =true;
			break;
		}
	}
		String result = (check)?"It is a Not Prime Number":"It is a Prime number";
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {

		CheckPrimeNumber obj = new CheckPrimeNumber();
		obj.CheckPrime(150);
	}
	
	

}
