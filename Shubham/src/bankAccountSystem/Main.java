package bankAccountSystem;

//Class Main
public class Main {

	public static void main(String[] args) {
		Saving obj1 = new Saving(); // Object of saving account
		Checking obj2 = new Checking(); // Object of saving account

		try {
			float bal1 = obj1.showBalance(25000, 5000);

			System.out.println("Total balance is: " + bal1);

			String status1 = obj1.transactionInfo(bal1, 20000);

			System.out.println("Transaction " + status1);

			System.out.println();

			float bal2 = obj2.showBalance(50000, 15000);

			System.out.println("Total balance is: " + bal2);

			String status2 = obj2.transactionInfo(bal2, 55000);

			System.out.println("Transaction " + status2);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
