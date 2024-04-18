package session10;

//This is Main class. It has d objests of child classes.

public class Main {

	public static void main(String[] args) {
		Programmer pgr = new Programmer();// Object of Child class of Programmer
		AssistantProfessor assisprof = new AssistantProfessor();// Object of Child class of AssistantProfessor
		AssociateProfessor assosiprof = new AssociateProfessor();// Object of Child class of AssociateProfessor
		Professor prof = new Professor();// Object of Child class of Professor

		// To calculate all the salary components & Actual Salary of Programmer
		double val1 = pgr.calculateDa(pgr.pgrBasic);
		double val2 = pgr.calculateHra(pgr.pgrBasic);
		double val3 = pgr.calculatePf(pgr.pgrBasic);
		double val4 = pgr.calculateScf(pgr.pgrBasic);
		double val5 = pgr.calculateGrossSal(pgr.pgrBasic, val1, val2);
		double val6 = pgr.calculateNettSal(val5, val3, val4);

		// To display all the salary components & Actual Salary of Programmer
		System.out.println("DA of Programmer is : " + val1 + " rs");
		System.out.println("Hra of Programmer is : " + val2 + " rs");
		System.out.println("Pf of Programmer is : " + val3 + " rs");
		System.out.println("Scf of Programmer is : " + val4 + " rs");
		System.out.println("Gross Salary of Programmer is : " + val5 + " rs");
		System.out.println("Nett Salary of Programmer is : " + val6 + " rs");

		System.out.println();

		// To calculate all the salary components & Actual Salary of Assistant Professor
		double val7 = assisprof.calculateDa(assisprof.assisprofBasic);
		double val8 = assisprof.calculateHra(assisprof.assisprofBasic);
		double val9 = assisprof.calculatePf(assisprof.assisprofBasic);
		double val10 = assisprof.calculateScf(assisprof.assisprofBasic);
		double val11 = assisprof.calculateGrossSal(assisprof.assisprofBasic, val7, val8);
		double val12 = assisprof.calculateNettSal(val11, val9, val10);

		// To display all the salary components & Actual Salary of Assistant Professor
		System.out.println("DA of AssistantProfessor is : " + val7 + " rs");
		System.out.println("Hra of AssistantProfessor is : " + val8 + " rs");
		System.out.println("Pf of AssistantProfessor is : " + val9 + " rs");
		System.out.println("Scf of AssistantProfessor is : " + val10 + " rs");
		System.out.println("Gross Salary of AssistantProfessor is : " + val11 + " rs");
		System.out.println("Nett Salary of AssistantProfessor is : " + val12 + " rs");

		System.out.println();

		// To calculate all the salary components & Actual Salary of Associate Professor
		double val13 = assosiprof.calculateDa(assosiprof.assosiprofBasic);
		double val14 = assosiprof.calculateHra(assosiprof.assosiprofBasic);
		double val15 = assosiprof.calculatePf(assosiprof.assosiprofBasic);
		double val16 = assosiprof.calculateScf(assosiprof.assosiprofBasic);
		double val17 = assosiprof.calculateGrossSal(assosiprof.assosiprofBasic, val13, val14);
		double val18 = assosiprof.calculateNettSal(val17, val15, val16);

		// To display all the salary components & Actual Salary of Associate Professor
		System.out.println("DA of AssociateProfessor is : " + val13 + " rs");
		System.out.println("Hra of AssociateProfessor is : " + val14 + " rs");
		System.out.println("Pf of AssociateProfessor is : " + val15 + " rs");
		System.out.println("Scf of AssociateProfessor is : " + val16 + " rs");
		System.out.println("Gross Salary of AssociateProfessor is : " + val17 + " rs");
		System.out.println("Nett Salary of AssociateProfessor is : " + val18 + " rs");

		System.out.println();

		// To calculate all the salary components & Actual Salary of Professor
		double val19 = prof.calculateDa(prof.profBasic);
		double val20 = prof.calculateHra(prof.profBasic);
		double val21 = prof.calculatePf(prof.profBasic);
		double val22 = prof.calculateScf(prof.profBasic);
		double val23 = prof.calculateGrossSal(prof.profBasic, val19, val20);
		double val24 = prof.calculateNettSal(val23, val21, val22);

		// To display all the salary components & Actual Salary of Professor
		System.out.println("DA of Professor is : " + val19 + " rs");
		System.out.println("Hra of Professor is : " + val20 + " rs");
		System.out.println("Pf of Professor is : " + val21 + " rs");
		System.out.println("Scf of Professor is : " + val22 + " rs");
		System.out.println("Gross Salary of Professor is : " + val23 + " rs");
		System.out.println("Nett Salary of Professor is : " + val24 + " rs");
	}

}
