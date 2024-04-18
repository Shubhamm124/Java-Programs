package session12;

class Main {

	public static void main(String[] args) {
//		Car c = new Car();
		Tata nano = new Tata();
//		nano.value = 6;
		int val1 = nano.accelerate();
		System.out.println(val1);
		System.out.println(Assembly.value);
		nano.checkFitting();
		nano.joinPart();
		nano.getWheels();

		System.out.println();
		System.out.println();

		Maruti maruti800 = new Maruti();
		int val2 = maruti800.accelerate();
		System.out.println(val2);
		System.out.println(Assembly.value);
		maruti800.checkFitting();
		maruti800.joinPart();
		maruti800.getWheels();
	}
}
