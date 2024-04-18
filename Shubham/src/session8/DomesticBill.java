package session8;

//This is child class named as DomesticBill. It has abstract method inherited from ElectricityBill.

class DomesticBill extends ElectricityBill {

	// This method calculates Bill Amount of the Domestic consumers. It takes units
	// as a parameter.
	public long billAmount(long units) {
		long totalAmount = 0;
		if (units <= 100) {
			// For first 100 units the charge is rupees 1 per unit.
			totalAmount = units * 1;
		} else if (units > 100 && units <= 200) {
			// For 101 to 200 units the charge is 5/2 i.e 2.5 rupees per unit.
			totalAmount = (units - 100) * 5 / 2 + (100 * 1);
		} else if (units > 200 && units <= 500) {
			// For 201 to 500 units the charge is 4 rupees per unit.
			totalAmount = (units - 200) * 4 + (100 * 5 / 2) + (100 * 1);
		} else if (units > 500) {
			// For above 500 units the charge is 6 rupees per unit.
			totalAmount = (units - 500) * 6 + (300 * 4) + (100 * 5 / 2) + (100 * 1);
		}
		return totalAmount;
	}

	@Override
	protected long billAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
