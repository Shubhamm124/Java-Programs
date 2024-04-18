package session3;

public class Car {
	static String carWheels = "4 wheeler";

	String carName;
	String carColor;
	int carPrice;

	public float calculateCarSpeed(float distance, float time) {
		float speed = distance / time;
		return speed;
	}

	public static void main(String[] args) {
		Car Maruti800 = new Car();
		Car Innova = new Car();
		Car HondaCity = new Car();
		
//		String myCar = Maruti800.carName;

		float speed1 = Maruti800.calculateCarSpeed(250.0f, 5.0f);
		float speed2 = Innova.calculateCarSpeed(180.0f, 3.0f);
		float speed3 = HondaCity.calculateCarSpeed(100.0f, 8.0f);
		
//		System.out.println(myCar);
		System.out.println("Speed of Maruti800 is : " + speed1 + " km/h");
		System.out.println("Speed of Innova is : " + speed2 + " km/h");
		System.out.println("Speed of HondaCity is : " + speed3 + " km/h");
	}

}
