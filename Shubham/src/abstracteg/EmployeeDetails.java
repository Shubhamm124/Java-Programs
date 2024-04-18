package abstracteg;

public class EmployeeDetails {
	// default variables accessible in the same package only
	String empName;
	String empLocation;

	// public Method accessible everywhere
	public int calculateSalary(int perdaysal, int attendance) {
		int salary = perdaysal * attendance;
		return salary;
	}

	// default Method accessible in same package only
	int calSal(int perdaysal, int attendance) {
		int salary = perdaysal * attendance;
		return salary;
	}

	// private Method accessible in the same class only
	private int[] calculateTaxNPF(int salary) {
		int tax = salary / 10;
		int pf = salary / 20;
		int[] taxnpf = { tax, pf };
		return taxnpf;
	}

	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		int salary1 = obj.calculateSalary(1500, 25);
		System.out.println(salary1);
		int salary2 = obj.calSal(1200, 28);
		System.out.println(salary2);

		int[] data = obj.calculateTaxNPF(salary1);
		System.out.println(data[0]);
		System.out.println(data[1]);
	}
}
