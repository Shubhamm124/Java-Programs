package session14;

public class Main {

	public static void main(String[] args) {
		Rakesh obj1 = new Rakesh();
		Shubham obj2 = new Shubham();

		int age1 = obj1.calculateAge(2000);
		int age2 = obj2.calculateAge(1999);
		System.out.println();
		System.out.println("The age of Rakesh is : " + age1 + " years");
		System.out.println("The age of Shubham is : " + age2 + " years");

		System.out.println();

		obj1.showStd("11th");
		obj2.showStd("12th");

	}

}
























