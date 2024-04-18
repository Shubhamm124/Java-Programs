package Session1;

public class Company {

	public void displayCompanySize(int women) {
		int ratio = 0;
		if (women == 0) {
			throw new ArithmeticException("/ by 0.");
		} else {
			ratio = 10 / women;
			System.out.println(ratio);
		}
	}

	public static void main(String[] args) {
		Company cloverinfo = new Company();

		try {
			cloverinfo.displayCompanySize(2);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
