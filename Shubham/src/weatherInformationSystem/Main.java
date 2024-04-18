package weatherInformationSystem;

//Main class
public class Main {

	public static void main(String[] args) {
		Weather weatherobj = new Weather(); // Obj of Weather

		try {
			weatherobj.displayWeather(400084);

			weatherobj.displayWeather(400072);

			weatherobj.displayWeather(400104);

			weatherobj.displayWeather(400071);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
