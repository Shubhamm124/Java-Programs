package session7;

public class Honda extends Car {
	Honda() {
		System.out.println("Constructor of Honda is called ");
	}

	@Override
	void accelerate() {
		System.out.println("Accelarating Honda");// Implementation of abstract method
	}

	public static void main(String[] args) {
		Honda hondaCity = new Honda();
		hondaCity.accelerate();
	}
}
