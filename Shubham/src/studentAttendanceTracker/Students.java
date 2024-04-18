package studentAttendanceTracker;

//Student class to store the information of students.
public class Students {

	// This is a method to clculate Attendance Percentage. It has 2 parameters one
	// is attended days & other is total no Of Days.

	public float calcAttendPercentage(float attended, float noOfDays) {
		float attendance = (attended / noOfDays) * 100.0f;
		if (attendance < 75.0f) {
			throw new ArithmeticException("Your attendance is less than 75%, You cannot give exam!");
		} else if (attendance >= 75.0f && attendance <= 100.0f) {
			attendance = (attended / noOfDays) * 100.0f;
		} else if (attendance > 100.0f) {
			throw new ArithmeticException("Your attendance Cannot be more than 100%!");
		}
		return attendance;
	}
}
