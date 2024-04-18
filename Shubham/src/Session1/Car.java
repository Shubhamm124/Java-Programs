package Session1;

public class Car {
	static int noOfWheels = 4;

	int carPrice;
	String carModel;
	String carColor;

	Car() {

	}
	
	Car(int carPrice) {
		this.carPrice = carPrice;
	}

	public float calcMileage(float distance, float fuelConsume) {
		float mileage = distance / fuelConsume;
		return mileage;

	}

	public static void main(String[] args) {
		Car Maruti800 = new Car();
		Car Innova = new Car(1300000);
		Car HondaCity = new Car(1000000);
		
		
		Maruti800.carPrice = 7000000;
		System.out.println(Maruti800.carPrice);
		System.out.println(Innova.carPrice);
		System.out.println(HondaCity.carPrice);
		
		
		

	}
}
