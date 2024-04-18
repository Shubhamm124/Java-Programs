package hospitalAppointmentSystem;

//Class Main
public class Main {

	public static void main(String[] args) {
		Doctor1 p1 = new Doctor1(); // Obj patient 1
		Doctor2 p2 = new Doctor2(); // Obj patient 2

		try {
			String status1 = p1.appointmentInformation(true, 12);

			System.out.println(status1);

			String status2 = p1.appointmentInformation(true, 8);

			System.out.println(status2);

			String status3 = p2.appointmentInformation(true, 5);

			System.out.println(status3);

			String status4 = p2.appointmentInformation(false, 6);

			System.out.println(status4);
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
