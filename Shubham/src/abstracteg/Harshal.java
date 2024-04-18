package abstracteg;

class Harshal extends Employee implements Data {

	public long calculateSalary(long perdaysal, long attendance) {
		long salary = perdaysal * attendance;
		return salary;
	}
	
	public long calculatePf(long payment) {
		long pf = payment/10;
		return pf;
	}

	@Override
	public long calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long calculatePf() {
		// TODO Auto-generated method stub
		return 0;
	}
}
