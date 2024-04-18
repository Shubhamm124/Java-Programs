package session5;

public class Employee {

	float height, weight, waist;

	Employee(float[] bodyData) {
		this.height = bodyData[0];
		this.weight = bodyData[1];
		this.waist = bodyData[2];
	}

	public static void main(String[] args) {

		float[] bodyData1 = { 5.7f, 59.5f, 28.0f };
		float[] bodyData2 = { 5.9f, 62.5f, 29.5f };

		Employee amol = new Employee(bodyData1);
		Employee shubham = new Employee(bodyData2);

		System.out.println(amol.height);
		System.out.println(amol.weight);
		System.out.println(amol.waist);
		System.out.println(shubham.height);
		System.out.println(shubham.weight);
		System.out.println(shubham.waist);

	}
}
