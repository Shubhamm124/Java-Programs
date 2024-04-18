package session16;

import java.util.*;

public class Set1 {
	public static void main(String[] args) {
		HashSet<String> colorSet = new HashSet<String>();
		colorSet.add("Red");
		colorSet.add("Green");
		colorSet.add("Blue");

		Iterator<String> itr = colorSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		colorSet.remove("Green");
		
		System.out.println(colorSet);
	}
}