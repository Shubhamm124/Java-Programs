package weatherInformationSystem;

//Class Weather to stored location & pincode also has 1 Method.
public class Weather {
	String location;
	int pincode;

	// display weather method to show the weather info.
	public void displayWeather(int pincode) throws Exception {
		if (pincode == 400084) {
			System.out.println("Asalpha's Weather is - Sunny day, No changes!");
		} else if (pincode == 400072) {
			System.out.println("Powai's Weather is - Cloudy day, Rain is expected please carry Raincoat!");
		} else if (pincode == 400104) {
			System.out.println("Premnagar's Weather is - Heavy Rain, If possible stay at home!");
		} else {
			throw new Exception("Invalid Pincode!");
		}
	}
}
