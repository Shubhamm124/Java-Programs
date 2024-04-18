package session11;

//This is child class named as Circle. It has Abstract method inherited from Shape.


class Circle extends Shape {
	//This method calculates the area for Circle. It takes radius as a parameter.
	public float printArea(float radius) {
		float area = 3.14f * radius * radius;
		return area;
	}

	@Override
	protected float printArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
