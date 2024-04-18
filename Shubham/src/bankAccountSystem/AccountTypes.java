package bankAccountSystem;

//Class AccountTypes to stored acc no & ifsc code related to it. abstract methods showBalance & transactionInfo
//are there
abstract class AccountTypes {
	long accNo;
	String ifscCode;

	abstract public float showBalance(float actualBal, float depositAmt);

	abstract public String transactionInfo(float totalBal, int amtWithdrawl) throws Exception;
}
