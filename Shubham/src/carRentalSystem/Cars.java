package carRentalSystem;

//Class Cars to stored information of cars.
public class Cars {
	String carModel;
	long carPrice;
	String custName;
	String rentalName;

	// rentalCharges method to calculate the rental charges on the basis of car
	// Availability.
	public int rentalCharges(boolean carAvailability, int noOfDays, int perDayCharge) throws Exception {
		int rent = 0;
		if (carAvailability == true) {
			System.out.println("Car is Available!");
			rent = noOfDays * perDayCharge;
		} else if (carAvailability == false) {
			throw new Exception("Car is not Available!");
		}
		return rent;
	}
}
