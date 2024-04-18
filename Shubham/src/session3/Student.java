package session3;

public class Student {
	
	static String schoolName = "Samata Vidya Mandir";
	
	String studentName;
	String studentRollNo;
	int studentFees;
	
	public float calculatestudentMarks(float x, float y, float z) {
		float totalMarks = x + y + z;
		float avg = totalMarks/3;
		return avg;
	}

	public static void main(String[] args) {
		
		Student akshay = new Student();
		Student aniket = new Student();
		Student vijay = new Student();
		
		
		float avg1 = akshay.calculatestudentMarks(45.0f, 47.0f, 92.0f);
		float avg2 = aniket.calculatestudentMarks(78.0f, 45.0f, 68.0f);
		float avg3 = vijay.calculatestudentMarks(50.0f, 72.0f, 58.0f);
		
		System.out.println("The total marks of akshay are : " + avg1);
		System.out.println("The total marks of aniket are : " + avg2);
		System.out.println("The total marks of vijay are : " + avg3);

	}

}
