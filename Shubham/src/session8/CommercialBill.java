package session8;

//This is child class named as CommercialBill. It has abstract method inherited from ElectricityBill.

class CommercialBill extends ElectricityBill {

	// This method calculates Bill Amount of the Commercial consumers. It takes
	// units as a parameter.
	public long billAmount(long units) {
		long totalAmount = 0;
		if (units <= 100) {
			// For first 100 units the charge is rupees 2 per unit.
			totalAmount = units * 2;
		} else if (units > 100 && units <= 200) {
			// For 101 to 200 units the charge is 9/2 i.e 4.5 rupees per unit.
			totalAmount = (units - 100) * 9 / 2 + (100 * 2);
		} else if (units > 200 && units <= 500) {
			// For 201 to 500 units the charge is 6 rupees per unit.
			totalAmount = (units - 200) * 6 + (100 * 9 / 2) + (100 * 2);
		} else if (units > 500) {
			// For above 500 units the charge is 7 rupees per unit.
			totalAmount = (units - 500) * 7 + (300 * 6) + (100 * 9 / 2) + (100 * 2);
		}
		return totalAmount;
	}

	@Override
	protected long billAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
