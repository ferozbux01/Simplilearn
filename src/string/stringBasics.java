package string;

public class stringBasics {
public static void main(String[] args) {
	String firstName = "Tony";
	String lastName = "Stark";
	String fullName = firstName + " " + lastName;
	System.out.println(fullName);
	System.out.println(fullName.length());
	for(int i=0; i<fullName.length();i++)
		System.out.println(fullName.charAt(i));
	System.out.println(firstName.compareTo(lastName));
	System.out.println(firstName.equals(lastName));
	String test = "My name is tony Stark and I love technology";
	String test1 = test.substring(5,15);
	System.out.println(test1);
	String test2 = test.substring(10);
	System.out.println(test2);
}
}

