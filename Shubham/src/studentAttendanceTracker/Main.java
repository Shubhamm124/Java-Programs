package studentAttendanceTracker;

//Main class
public class Main {

	public static void main(String[] args) {
		try {
			Students stud1 = new Students();// Object for Student 1
			Students stud2 = new Students();// Object for Student 2

			float op1 = stud1.calcAttendPercentage(24.0f, 30.0f);

			System.out.println("Attendance of student1 is: " + op1 + "%");

			float op2 = stud2.calcAttendPercentage(30.5f, 30.0f);

			System.out.println("Attendance of student2 is: " + op2 + "%");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
