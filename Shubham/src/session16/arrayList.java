package session16;

import java.util.*;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("1");
		cityList.add("2");
		cityList.add("3");
		cityList.add("4");

		try {
			System.out.println(cityList);

			System.out.println(cityList.isEmpty());
			System.out.println(cityList.get(4));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}