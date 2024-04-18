package session5;

public class Student {

	public String studentName(String name) {
		return name;
	}

	public int studentAge(int age) {
		return age;
	}

	public float studentMarks(float marks) {
		return marks;
	}

	public void displayMessage() {
		System.out.println("The Message is Clear!");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		String value1 = stud.studentName("Shubham");
		int value2 = stud.studentAge(25);
		float value3 = stud.studentMarks(74.5f);
		stud.displayMessage();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
