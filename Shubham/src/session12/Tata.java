package session12;

class Tata extends Car implements Assembly {

	int accelerate() {
		speed = 40;
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
