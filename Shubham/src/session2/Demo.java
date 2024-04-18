package session2;

public class Demo {

	public static void main(String[] args) {
		int[] fruitPrice = { 50, 60, 70, 60, 100};
		int totalPrice = 0;
		for (int i = 0; i < fruitPrice.length; i++) {
			totalPrice = totalPrice + fruitPrice[i];
		}
		System.out.println(totalPrice);
		System.out.println("Average price of a fruit is : " + totalPrice / fruitPrice.length);
	}
}