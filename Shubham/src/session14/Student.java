package session14;

public class Student {
	String studName;
	String studStd;
	String studAddr;

	Student() {
		System.out.println("Parent class - Student");
	}

	public int calculateAge(int birthYear) {
		int age = 2024 - birthYear;
		return age;
	}

}
