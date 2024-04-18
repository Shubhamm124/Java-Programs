package session13;

class Bmw implements Vehicle {
	@Override

	public long calculateEmi(long totalPrice, long years) {
		long emi = totalPrice / (12 * years);
		return emi;
	}

//	public void show() {
//		System.out.println("Starts with self-start & kick as well");
//	}

}
