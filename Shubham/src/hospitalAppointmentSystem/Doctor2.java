package hospitalAppointmentSystem;

//Class Doctor2 inherits Hospital
class Doctor2 extends Hospital {
	final String doctorName = "Dr. Malay Dave"; // Dr name

	//appointmentInformation method to show the Dr Availability on the basis of timings.
	public String appointmentInformation(boolean drAvailability, int timing) throws Exception {
		String appointmentStatus = null;
		if (drAvailability == true) {
			if (timing == 4) {
				appointmentStatus = "Dr. is Available";
			} else if (timing == 5) {
				appointmentStatus = "Dr. is Available";
			} else if (timing == 6) {
				appointmentStatus = "Dr. is Available";
			} else if (timing == 7) {
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
