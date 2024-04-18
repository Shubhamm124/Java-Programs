package session13;

public class Main {

	public static void main(String[] args) {
		Bmw BMWG310R = new Bmw();
		RoyalEnfield Classic350 = new RoyalEnfield();

		long emi1 = BMWG310R.calculateEmi(289991, 3);
		long emi2 = Classic350.calculateEmi(193080, 2);

		System.out.println("The Monthly emi of BMWG310R is : " + emi1 + " rs.");
		System.out.println("The Monthly emi of RoyalEnfield Classic350 is : " + emi2 + " rs.");
		System.out.println();
		BMWG310R.show();
		Classic350.show();
		System.out.println();
		System.out.println(Vehicle.noOfTyres);

	}

}
