package session12;

class Maruti extends Car implements Assembly {

	int accelerate() {
		speed = 30;
		return speed;
	}

	public void joinPart() {
		System.out.println("joinPart");
	};

	public String getWheels() {
		System.out.println("getWheels");
		return "Hello";
	};

	public void checkFitting() {
		System.out.println("checkFitting");
	};
}
