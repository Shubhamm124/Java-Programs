package abstracteg;

abstract public class Employee {

	public String emplName;
	public String emplAddr;
	protected long emplSal;
	public int emplAge;

	public int calculateAge(int birthYear) {
		int age = 2024 - birthYear;
		return age;
	}

	abstract public long calculateSalary();
}
