package abstracteg;

public class Main {

	public static void main(String[] args) {
		Shubham obj1 = new Shubham();
		System.out.println();
		Harshal obj2 = new Harshal();
		System.out.println();
		long sal1 = obj1.calculateSalary(2000, 25);
		long sal2 = obj2.calculateSalary(2500, 24);

		System.out.println("Salary of Shubham is : " + sal1 + " rs");
		System.out.println("Salary of Harshal is : " + sal2 + " rs");
		System.out.println();

		int age1 = obj1.calculateAge(1999);
		int age2 = obj2.calculateAge(2000);

		System.out.println("Age of Shubham is : " + age1 + " years");
		System.out.println("Age of Harshal is : " + age2 + " years");
		System.out.println();

		long pf1 = obj1.calculatePf(sal1);
		long pf2 = obj2.calculatePf(sal2);

		System.out.println("Pf of Shubham is : " + pf1 + " rs");
		System.out.println("Pf of Harshal is : " + pf2 + " rs");
		
		
		System.out.println(Data.officeAddr);
		System.out.println(Data.officeAddr);
	}

}
