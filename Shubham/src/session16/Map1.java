package session16;

import java.util.HashMap;

public class Map1 {
	public static void main(String[] args) {
		HashMap<String, String> emplInfo = new HashMap<String, String>();
		emplInfo.put("Name", "Shubham");
		emplInfo.put("Age", "25");
		emplInfo.put("Role", "Back End Developer");

		System.out.println(emplInfo.get("Name"));
		System.out.println(emplInfo.get("Age"));
		System.out.println(emplInfo.get("Role"));

	}
}
