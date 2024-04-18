package session13;

public interface Vehicle {
	int noOfTyres = 2;

	public abstract long calculateEmi(long totalPrice, long years);

	default void show() {
		System.out.println("Vehicles are bikes");
	};
}
