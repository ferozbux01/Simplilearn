package string;

public class StringImmutable {
public static void main(String[] args) {
	String name = "James Smith";
	System.out.println(name);
	name.concat(" is an acter");
	System.out.println(name);
	String sentence = name.concat(" is an actor");
	System.out.println(sentence);
	
	String s1=new String("James Smith");
	s1.concat("is an actor");
	System.out.println(s1);
}
}
