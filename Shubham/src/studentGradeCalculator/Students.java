package studentGradeCalculator;

//Class Students has 3 variables & 2 methods. 

public class Students {
	String studName;
	String subjects;
	int studMarks;

	// 1st method to calculate average marks of a Student.
	public float calculateAverageMarks(float[] studMarks) {
		float avg = (studMarks[0] + studMarks[1] + studMarks[2]) / studMarks.length;
		if (avg < 0) {
			throw new ArithmeticException("Average cannot be less than 0!");
		} else if (avg > 100) {
			throw new ArithmeticException("Average cannot be more than 100!");
		}
		return avg;
	}

	// 2nd method to display grade of a Student.
	public String displayGrade(float avg) {
		String grade = null;
		if (avg > 90 && avg <= 100) {
			grade = "Grade A";
		} else if (avg <= 90 && avg > 80) {
			grade = "Grade B";
		} else if (avg <= 80 && avg > 70) {
			grade = "Grade C";
		} else if (avg <= 70 && avg > 60) {
			grade = "Grade D";
		} else if (avg < 40 && avg >= 0) {
			grade = "Grade F";
		}
		return grade;
	}
}
