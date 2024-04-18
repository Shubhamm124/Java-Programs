package session6;

public class Main {

	public static void main(String[] args) {
		Student Harshal = new Student();
		Harshal.stuName = "Harry";
		Harshal.stuAddr = "Kurla West";
		Harshal.setStuMarks(87);
		System.out.println(Harshal.stuName);
		System.out.println(Harshal.stuAddr);
		System.out.println(Harshal.getStuMarks());

//		String value1 = Harshal.displayName("Harry");
//		System.out.println(value1);
//		String value2 = Harshal.displayStuAddr("Kurla West");
//		System.out.println(value2);
//		int value3 = Harshal.displayStuMarks(92);
//		System.out.println(value3);
	}

}
