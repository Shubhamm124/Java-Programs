package session16;

import java.util.*;

public class TestJavaCollection7 {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

		System.out.println(set);
		set.remove("Ravi");
		System.out.println(set);	

	}
}