package studentGradeCalculator;

//Main class
public class Main {

	public static void main(String[] args) {
		Shubham stud1 = new Shubham(); // Object for student 1
		Rakesh stud2 = new Rakesh(); // Object for student 2

		try {
			float[] studMarks1 = { 95, 85, 91 };
			float[] studMarks2 = { 92, 87, 85 };

			float avg1 = stud1.calculateAverageMarks(studMarks1);

			System.out.println("The Average Marks of Shubham is : " + avg1);

			String grade1 = stud1.displayGrade(avg1);

			System.out.println("The Grade of Shubham is : " + grade1);

			System.out.println();

			float avg2 = stud2.calculateAverageMarks(studMarks2);

			System.out.println("The Average Marks of Rakesh is : " + avg2);

			String grade2 = stud2.displayGrade(avg2);

			System.out.println("The Grade of Rakesh is : " + grade2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
