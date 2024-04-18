package session11;

//This is Main class. It has 3 objests of child classes.

public class Main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();// Object of Child class of Rectangle
		Triangle tri = new Triangle();// Object of Child class of Triangle
		Circle cir = new Circle();// Object of Child class of Circle

		// Calculated area of all the Shapes given.
		float area1 = rec.printArea(5, 10);
		float area2 = tri.printArea(20, 4);
		float area3 = cir.printArea(7.0f);

		// To display area of all the Shapes given.
		System.out.println("The Area of Rectangle is : " + area1 + " meter square");
		System.out.println("The Area of Triangle is : " + area2 + " meter square");
		System.out.println("The Area of Circle is : " + area3 + " meter square");
	}

}
