package Session1;

public class ArrayProgram {

	public static void main(String[] args) {
		int[] arr = { 12, 45, 78, 102, 123 };

		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("Last element is at index 4!");
		}
	}

}
