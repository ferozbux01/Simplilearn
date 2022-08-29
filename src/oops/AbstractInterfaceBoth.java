package oops;

interface C{
	void a();
	void b();
	void c();
	void d();
}
abstract class D implements C{
	public void b()
	{
		System.out.println("method c is concrete now");
	}
}
class E extends D{

	@Override
	public void a() {
		System.out.println("method a is concrete now");
	}

	@Override
	public void c() {
		System.out.println("method c is concrete now");
		
	}

	@Override
	public void d() {
		System.out.println("method d is concrete now");
		
	}
	
}


public class AbstractInterfaceBoth {
public static void main(String[] args) {
	C obj = new E();
	obj.a();
	obj.b();
	obj.c();
	obj.d();
	
}
}
