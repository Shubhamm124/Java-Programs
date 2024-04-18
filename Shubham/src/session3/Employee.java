package session3;

public class Employee {
	String emplName;
	String emplAge;
	public String emplAddr;

	public float calculateSalary(float perdaysal, float attendance, float allowedLeaves) {
		float salary = perdaysal * (attendance + allowedLeaves);
		return salary;
	}

	public float calculateIncomeTax(float salary) {
		float incTax = 0.0f;
		if (salary < 20000.0f) {
			incTax = salary / 10.0f;
		} else if (salary > 20000.0f && salary <= 30000.0f) {
			incTax = salary / 5.0f;
		} else if (salary > 30000.0f) {
			incTax = salary * (3.0f / 10.0f);
		}
		return incTax;
	}

	public float calculatePf(float salary) {
		float pf = 0.0f;
		if (salary < 20000.0f) {
			pf = salary / 50.0f;
		} else if (salary > 20000.0f && salary <= 30000.0f) {
			pf = salary / 25.0f;
		} else if (salary > 30000.0f) {
			pf = salary * (7.0f / 100.0f);
		}
		return pf;
	}

	public static void main(String[] args) {
		Employee shubham = new Employee();
		Employee amit = new Employee();

		float sal1 = shubham.calculateSalary(2000, 24, 2);
		float sal2 = amit.calculateSalary(1500, 22, 2);

		float intax1 = shubham.calculateIncomeTax(sal1);
		float intax2 = amit.calculateIncomeTax(sal2);

		float pf1 = shubham.calculatePf(sal1);
		float pf2 = amit.calculatePf(sal2);

		System.out.println("Salary of shubham is : " + sal1);
		System.out.println("Salary of amit is : " + sal2);
		System.out.println("Income tax of shubham is : " + intax1);
		System.out.println("Income tax of amit is : " + intax2);
		System.out.println("pf of shubham is : " + pf1);
		System.out.println("pf of amit is : " + pf2);

	}
}
