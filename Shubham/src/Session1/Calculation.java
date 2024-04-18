package Session1;

public class Calculation {

	public int calculator(int a, String b, int c) {
		int op = 0;

		switch (b) {
		case "+":
			op = a + c;
			break;

		case "-":
			op = a - c;
			break;

		case "*":
			op = a * c;
			break;

		case "/":
			op = a / c;
			break;

		default:
			throw new ArithmeticException("Invalid Input");
		}

		return op;

	}

	public static void main(String[] args) {
		Calculation obj = new Calculation();
		int op1 = obj.calculator(150, "/", 25);
		System.out.println("Your answer is: " + op1);

	}

}
