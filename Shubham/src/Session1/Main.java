package Session1;

public class Main {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.start();

		String[] names = { "Shubham", "Prashant", "Mayank", "Swarup" };
		try {
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i + 1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}