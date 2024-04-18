package session8;

//This is parent class named as ElectricityBill. It has 5 variables and 2 methods. One is public method
//& other is Abstract.

abstract class ElectricityBill {
	long consNo;// Consumer Number
	String consName;// Name of the Consumer
	protected long PrevReading;// previous reading for electricity bill
	protected long currReading;// Current reading for electricity bill
	String ebType;// Consumer Number

	// This method calculates the Units consumed by the consumer.
	// It takes 2 parameters in the form of current & previous readings.
	// And returns total units consumed.

	public long calculateUnitCnsume(long current, long previous) {
		long unitConsume = current - previous;
		return unitConsume;
	}

	protected abstract long billAmount();
}
