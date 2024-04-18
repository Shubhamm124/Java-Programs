package Session1;

public class Employee {
	// Common Data for all Employee Objects
	static String companyName = "LexisNexisRisk";
	// Specific Data of individual Employee Objects
	String empName;
	String empLocation;

	// Method to Calculate Salary of Employee
	public int calculateSalary(int perdaysal, int attendance, int allowedLeaves) {
		int salary = perdaysal * (attendance + allowedLeaves);
		return salary;
	}

	public float calculateTax(float sal) {
		float tax = 0;
		if (sal <= 20000) {
			tax = sal * (10.0f / 100.0f);
		} else if (sal > 20000 && sal <= 30000) {
			tax = sal * (20.0f / 100.0f);
		} else if (sal > 30000) {
			tax = sal * (30.0f / 100.0f);
		}
		return tax;
	}

	public float calculatePf(float payment) {
		float pf = 0;
		if (payment <= 20000) {
			pf = payment * (2.0f / 100.0f);
		} else if (payment > 20000 && payment <= 30000) {
			pf = payment * (4.0f / 100.0f);
		} else if (payment > 30000) {
			pf = payment * (7.0f / 100.0f);
		}
		return pf;
	}

	public static void main(String[] args) {
		// Create Objects of Employee
		Employee akshay = new Employee();

		// Call to Calculate Salary Method of Employee
		int sal1 = akshay.calculateSalary(1500, 23, 1);
		System.out.println("Salary of Akshay is: " + sal1 + " rs.");

		float tax1 = akshay.calculateTax(sal1);
		System.out.println("Tax of Akshay is: " + tax1 + " rs.");

		float pf1 = akshay.calculatePf(sal1);
		System.out.println("Pf of Akshay is: " + pf1 + " rs.");
	}
}