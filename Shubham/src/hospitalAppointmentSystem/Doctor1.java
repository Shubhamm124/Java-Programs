package hospitalAppointmentSystem;

//Class Doctor1 inherits Hospital
class Doctor1 extends Hospital {
	final String doctorName = "Dr. Eknath Yewale"; // Dr name

	//appointmentInformation method to show the Dr Availability on the basis of timings.
	public String appointmentInformation(boolean drAvailability, int timing) throws Exception {
		String appointmentStatus = null;
		if (drAvailability == true) {
			if (timing == 12) {
				appointmentStatus = "Dr. is Available";
			} else if (timing == 1) {
				appointmentStatus = "Dr. is not Available, please come after some time!";
				System.out.println("Lunch time!");
			} else if (timing == 2) {
				appointmentStatus = "Dr. is Available";
			} else if (timing == 3) {
				appointmentStatus = "Dr. is Available";
			} else {
				appointmentStatus = "Invalid time slot!";
			}
		} else if (drAvailability == false) {
			throw new Exception("Dr. is not Available");
		}
		return appointmentStatus;
	}

}
