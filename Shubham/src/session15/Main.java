package session15;

public class Main {

	public void displayEligibility(int age) {
		try {
			if (age < 18 && age < 0) {
				throw new ArithmeticException("Age cannot be negative!");
			} else if (age < 18) {
				throw new ArithmeticException("You are not Eligible");
			} else if (age >= 18) {
				System.out.println("You are Eligible, please Vote!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.displayEligibility(33);
	}
}
