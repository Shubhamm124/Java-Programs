package Session1;

class REC extends College {

	@Override
	public void displayCollegeName(String clgName) {
		System.out.println("College name is: " + clgName);
	}

	public static void main(String[] args) {
		REC clg = new REC();
		clg.displayCollegeName("Regional Engineering College");
	}

}
