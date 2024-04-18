package session11;

//This is child class named as Rectangle. It has Abstract method inherited from Shape.

//This method calculates the area for Rectangle. It takes width & length as parameters.
class Rectangle extends Shape {
	public float printArea(float width, float length) {
		float area = width * length;
		return area;
	}

	@Override
	protected float printArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
