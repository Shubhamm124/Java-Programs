package Session1;

public class Temperature {
	public void convertTemperature(int degrees) {
		System.out.println("Temperature in degrees are :" + degrees);
	}

	public void convertTemperature(int degrees, int fahrenite) {
		System.out.println("Temperature in degrees are :" + degrees);
		System.out.println("Temperature in fahrenite are :" + fahrenite);
	}

	public static void main(String[] args) {
		Temperature t = new Temperature();
		t.convertTemperature(40);
		t.convertTemperature(35, 82);
	}
}
