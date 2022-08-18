package basicsOfJava;



public class StringAdd {

	 public void add(String a, String b, String c)
	{
		String total=a+b+c;
		System.out.println(total);
	}
	public static void main (String args[])
	{
		String q = "My";
		String r = " name ";
		String s = "is Feroz.";
		StringAdd n = new StringAdd();
		n.add(q,r,s);
	}}
