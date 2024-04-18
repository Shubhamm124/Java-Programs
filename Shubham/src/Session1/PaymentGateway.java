package Session1;

public interface PaymentGateway {
	final int amount = 1000;
	
	abstract public void transferPayment();
}
