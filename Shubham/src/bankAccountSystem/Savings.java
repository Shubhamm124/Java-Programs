package bankAccountSystem;

//Class Saving inherit AccountTypes.
class Saving extends AccountTypes {

	// showBalance method to find out available balance.
	@Override
	public float showBalance(float actualBal, float depositAmt) {
		float totalBal = actualBal + (actualBal * (7.0f / 100.0f)) + depositAmt;
		return totalBal;
	}

	// transactionInfo method to find out transaction Information.
	@Override
	public String transactionInfo(float totalBal, int amtWithdrawl) throws Exception {
		String transactionStatus = null;
		if (totalBal < amtWithdrawl) {
			transactionStatus = "Failed";
			throw new Exception("Balance is less!");
		} else if (totalBal == amtWithdrawl) {
			transactionStatus = "Failed";
			throw new Exception("Balance is same as amount required! balance must remain 2000 at least.");
		} else if (totalBal - 2000 > amtWithdrawl) {
			transactionStatus = "Successful";
		} else {
			throw new Exception("Invalid input!");
		}
		return transactionStatus;
	}
}
