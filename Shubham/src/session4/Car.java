package session4;

public class Car {
	String carModel;
	String carColor;
	int carPrice;

	static String carType = "4 wheeler";

	Car() {

	}

	Car(String carModel) {
		this.carModel = carModel;
	}

	Car(String carModel, int carPrice, String carColor) {
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.carColor = carColor;
	}

	public static void main(String[] args) {
		Car Maruti800 = new Car();
//		Maruti800.carModel = "suzuki ertiga";
		Car Innova = new Car("Toyota Innova Crysta");
		Car HondaCity = new Car("Honda City Hybrid", 1880000, "red");

		System.out.println("Model name of Maruti800 is : " + Maruti800.carModel);
		System.out.println("Model name of Innova is : " + Innova.carModel);
		System.out.println("Model name of HondaCity is : " + HondaCity.carModel + ", Price of HondaCity is : " + HondaCity.carPrice + ", Color of HondaCity is : " + HondaCity.carColor);
	}
}
