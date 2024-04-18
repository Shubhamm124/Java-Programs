package session5;

public class EmployeeDetails {
	// default variables accessible in the same package only
	String empName;
	String empLocation = "hi";

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
		EmployeeDetails shubham = new EmployeeDetails();
		EmployeeDetails amit = new EmployeeDetails();
		EmployeeDetails amol = new EmployeeDetails();

		int sal1 = shubham.calculateSalary(2000, 25);
		int sal2 = amit.calculateSalary(1200, 29);
		int sal3 = amol.calculateSalary(1500, 23);

		System.out.println(sal1);
		System.out.println(sal2);
		System.out.println(sal3);

		int sal4 = shubham.calSal(1000, 25);
		int sal5 = amit.calSal(1400, 29);
		int sal6 = amol.calSal(1200, 21);

		System.out.println(sal4);
		System.out.println(sal5);
		System.out.println(sal6);
		
		
		int tax1 = (shubham.calculateTaxNPF(sal1))[0];
		int tax2 = (amit.calculateTaxNPF(sal2))[0];
		int tax3 = (amol.calculateTaxNPF(sal3))[0];
		
		System.out.println(tax1);
		System.out.println(tax2);
		System.out.println(tax3);
		
		int pf1 = (shubham.calculateTaxNPF(sal1))[1];
		int pf2 = (amit.calculateTaxNPF(sal2))[1];
		int pf3 = (amol.calculateTaxNPF(sal3))[1];
		
		System.out.println(pf1);
		System.out.println(pf2);
		System.out.println(pf3);

	}
}