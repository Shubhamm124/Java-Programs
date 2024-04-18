package carRentalSystem;

//Class Main
public class Main {

	public static void main(String[] args) {
		Rentals r1 = new Rentals(); // 1st rental Obj
		Rentals r2 = new Rentals(); // 2nd rental Obj

		try {
			int rent1 = r1.rentalCharges(true, 2, 4500);

			System.out.println("The rent for the car is :" + rent1 + " rs");

			int rent2 = r2.rentalCharges(false, 4, 2000);

			System.out.println("The rent for the car is :" + rent2 + " rs");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
