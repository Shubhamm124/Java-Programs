package session5;

public class College {
	String clgName;
	public String clgAddr;
	private int clgFees;

	public void displayClgAddr() {
		System.out.print(clgAddr);
	}

	void displayClgName() {
		System.out.print(clgName);
	}

	private void displayClgFees() {
		System.out.print(clgFees);
	}

	public static void main(String[] args) {
		College kelkar = new College();
		kelkar.clgName = "VG Vaze college";
		kelkar.clgAddr = "Mulund West";
		kelkar.clgFees = 35000;
		College rj = new College();
		College poddar = new College();

		System.out.println("Name of the college is : " + kelkar.clgName);
		System.out.println("Address of the college is : " + kelkar.clgAddr);
		System.out.println("Fees of the college is : " + kelkar.clgFees);
//		System.out.println("Name of the college is : " + rj.clgName);
//		System.out.println("Address of the college is : " + rj.clgAddr);
//		System.out.println("Fees of the college is : " + rj.clgFees);
//		System.out.println("Name of the college is : " + poddar.clgName);
//		System.out.println("Address of the college is : " + poddar.clgAddr);
//		System.out.println("Fees of the college is : " + poddar.clgFees);

		kelkar.displayClgName();
		System.out.println();
		kelkar.displayClgAddr();
		System.out.println();
		kelkar.displayClgFees();
		System.out.println();
	}
}
