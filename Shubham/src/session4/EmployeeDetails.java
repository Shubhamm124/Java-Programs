package session4;

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

		Bank icici = new Bank(5000, 15000, 20000);
		System.out.println(icici.accCredit);
		System.out.println(icici.checkBalance);
		
		
		icici.accCredit();
		icici.checkBalance();
//		icici.accDebit();
	}

}