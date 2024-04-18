package session6;

class Student {

	String stuName;
	public String stuAddr;
	private int stuMarks;

	String displayName(String name) {
		return name;
	}

	public String displayStuAddr(String address) {
		return address;
	}

	private int displayStuMarks(int marks) {
		return marks;
	}

	public int getStuMarks() {
		return stuMarks;
	}

	public void setStuMarks(int stuMarks) {
		this.stuMarks = stuMarks;
	}

	public static void main(String[] args) {
		Student Harshal = new Student();
//		Harshal.stuName = "Harry";
//		Harshal.stuAddr = "Kurla West";
//		Harshal.stuMarks = 79;
//		System.out.println(Harshal.stuName);
//		System.out.println(Harshal.stuAddr);
//		System.out.println(Harshal.stuMarks);

		String value1 = Harshal.displayName("Harry");
		System.out.println(value1);
		String value2 = Harshal.displayStuAddr("Kurla West");
		System.out.println(value2);
		int value3 = Harshal.displayStuMarks(92);
		System.out.println(value3);

	}
}
