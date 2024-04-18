package session4;

public class Bank {
	public int accCredit;
	int checkBalance;
	private int accDebit;

	public void setAccDebit(int accDebit) {
		this.accDebit = accDebit;
	}

	public int getAccDebit() {
		return accDebit;
	}

	Bank(int accCredit, int checkBalance, int accDebit) {
		this.accCredit = accCredit;
		this.checkBalance = checkBalance;
		this.accDebit = accDebit;
	}

	public void accCredit() {
		System.out.println(accCredit);
	}

	void checkBalance() {
		System.out.println(checkBalance);
	}

	private void accDebit() {
		System.out.println(accDebit);
	}

	public int addBalance(int balance) {
		int newBal = balance + 50000;
		return newBal;
	}

	public static void main(String[] args) {

		Bank icici = new Bank(5000, 15000, 20000);

		System.out.println(icici.accCredit);
		System.out.println(icici.checkBalance);
		System.out.println(icici.accDebit);

		int value1 = icici.addBalance(icici.checkBalance);
		System.out.println(value1);

		icici.accCredit();
		icici.checkBalance();
		icici.accDebit();
	}

}