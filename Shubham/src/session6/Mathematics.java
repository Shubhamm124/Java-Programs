package session6;

public class Mathematics {
	int result;

	public int sum(int i, int j) // same method name sum() with 2 parameters
	{
		result = i + j; // output is different
		return result;
	}

	public int sum(int i, int j, int k) // same method name sum() with 3 parameters
	{
		result = i + j + k; // output is different
		return result;
	}

	public int sum(int i, int j, int k, int l) // same method name sum() 4 parameters
	{
		result = i + j + k + l; // output is different
		return result;
	}

	public static void main(String[] args) {
		Mathematics mathsObj = new Mathematics();
		int output1 = mathsObj.sum(10, 20);
		int output2 = mathsObj.sum(10, 20, 30);
		int output3 = mathsObj.sum(10, 20, 30, 40);
		System.out.println("1st Sum is " + output1);
		System.out.println("2nd Sum is " + output2);
		System.out.println("3rd Sum is " + output3);
	}
}
