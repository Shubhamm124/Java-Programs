package session10;

//This is child class named as Programmer. It has Abstract methods inherited from Employee.

class Programmer extends Employee {

	double pgrBasic = 10000;// Basic pay of Programmer

	// This method calculates DA of Programmer. It takes Basic pay as a parameter.
	public double calculateDa(double Bp) {
		double da = Bp * (97.00 / 100.00);
		return da;
	}

	// This method calculates HRA of Programmer. It takes Basic pay as a parameter.
	public double calculateHra(double Bp) {
		double hra = Bp * (1.00 / 10.00);
		return hra;
	}

	// This method calculates PF of Programmer. It takes Basic pay as a parameter.
	public double calculatePf(double Bp) {
		double pf = Bp * (12.00 / 100.00);
		return pf;
	}

	// This method calculates Staff Club Fund of Programmer. It takes Basic pay as a
	// parameter.
	public double calculateScf(double Bp) {
		double scf = Bp * (0.1 / 100);
		return scf;
	}

	// This method calculates Gross Salary of Programmer. It takes Basic pay, DA,
	// HRA as parameters.
	public double calculateGrossSal(double Bp, double Da, double Hra) {
		double grossSal = Bp + Da + Hra;
		return grossSal;
	}

//	This method calculates Nett Salary of Programmer. It takes Gross Salary, PF, Staff Club Fund
//	as parameters.
	public double calculateNettSal(double grossSal, double Pf, double Scf) {
		double nettSal = grossSal - Pf - Scf;
		return nettSal;
	}

	@Override
	public double calculateDa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateHra() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateScf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateGrossSal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateNettSal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
