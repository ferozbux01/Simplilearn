package string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Tony Stark");
		System.out.println(s);
		s.append(" is an actor");
		System.out.println(s);
		s.insert(17, "Team Player & ");
		System.out.println(s);
		
		s.replace(17, s.length(), "Ironman");
		System.out.println(s);
		s.delete(13, 16);
		System.out.println(s);
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.reverse());

		
	}

}
