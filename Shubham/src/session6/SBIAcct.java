package session6;

//Child Class to show Inheritance & Method Overriding
class SBIAcct extends BankAcct {
	@Override // Overridden Method
	void displayBankDetails() {
		System.out.println("Welcome to State Bank of India");// Changed code different from PArent class
	}

	public static void main(String[] args) {
		SBIAcct sbiacc = new SBIAcct();
		sbiacc.displayBankDetails();
	}
}
