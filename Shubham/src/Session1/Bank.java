package Session1;

public class Bank {

	private void debit() {
		System.out.println("debit method");
	}

	public void credit() {
		System.out.println("credit method");
	}

	void checkBalance() {
		System.out.println("checkBalance method");
	}

	public static void main(String[] args) {
		Bank bob = new Bank();

		bob.debit();
		
	}
}
