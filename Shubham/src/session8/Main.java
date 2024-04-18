package session8;

//This is Main class. It has 2 objests for 2 child classes in the form of dbill & cbill respectively.

public class Main {

	public static void main(String[] args) {
		DomesticBill dbill = new DomesticBill();// Object of Child class of DomesticBill
		CommercialBill cbill = new CommercialBill();// Object of Child class of CommercialBill

		// Calculated Values of Units Consumed.
		long val1 = dbill.calculateUnitCnsume(10123, 9965);
		long val2 = cbill.calculateUnitCnsume(11589, 11012);
		long val3 = dbill.calculateUnitCnsume(9653, 9163);
		long val4 = cbill.calculateUnitCnsume(9579, 9127);

		// To display Values of Units Consumed.
		System.out.println("Total Units Consumed are " + val1);
		System.out.println("Total Units Consumed are " + val2);
		System.out.println("Total Units Consumed are " + val3);
		System.out.println("Total Units Consumed are " + val4);

		System.out.println();

		// Calculated Bill Amount of the Consumers.
		long amount1 = dbill.billAmount(val1);
		long amount2 = cbill.billAmount(val2);
		long amount3 = dbill.billAmount(val3);
		long amount4 = cbill.billAmount(val4);

		// To display Bill Amount of the Consumers.
		System.out.println("The Bill amount of Domestic Consumer is : " + amount1 + " rs");
		System.out.println("The Bill amount of Commercial Consumer is : " + amount2 + " rs");
		System.out.println("The Bill amount of Domestic Consumer is : " + amount3 + " rs");
		System.out.println("The Bill amount of Commercial Consumer is : " + amount4 + " rs");
	}

}
