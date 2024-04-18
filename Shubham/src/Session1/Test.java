package Session1;

public class Test {
	public double displayCompanySize(double men, double women) throws ArithmeticException {
		double comsize = (men / women);
		if (women <= 0) {
			throw new ArithmeticException("/ by 0!");
		} else {
			return comsize;
		}

	}

	public static void main(String[] args) {
		Test t = new Test();

		double comsize1 = t.displayCompanySize(40, 0);
		System.out.println(comsize1);
	}

}
