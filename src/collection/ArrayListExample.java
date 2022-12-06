package collection;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {

public static void main(String[] args) {
	ArrayList abc = new ArrayList();
	abc.add("India");
	abc.add("America");
	abc.add("Australia");
	System.out.println(abc);
	System.out.println(abc.get(2));
	abc.add(1, "Italy");
	System.out.println(abc);
	abc.set(1, "Canada");
	System.out.println(abc);
	abc.remove(1);
	System.out.println(abc);
	System.out.println(abc.size());
	
	for(int i=0;i<abc.size();i++) {
		System.out.println(abc.get(i));
	}
	Collections.sort(abc);
	System.out.println(abc);
	Collections.sort(abc, Collections.reverseOrder());
	System.out.println(abc);
	
}

}
