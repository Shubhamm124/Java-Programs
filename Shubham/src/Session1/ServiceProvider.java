package Session1;

class ServiceProvider implements PaymentGateway {

	@Override
	public void transferPayment() {
		System.out.println("transferPayment amount is: " + amount);
	}

	public static void main(String[] args) {
		ServiceProvider sp = new ServiceProvider();
		sp.transferPayment();
	}

}
