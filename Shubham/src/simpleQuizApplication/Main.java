package simpleQuizApplication;

//Main class
public class Main {

	public static void main(String[] args) {
		try {
			Participant1 p1 = new Participant1();// Object for 1st Participant
			Participant2 p2 = new Participant2();// Object for 2nd Participant

			int op1 = p1.displayQuizPoints(10, 2);

			System.out.println("Participant1 has got: " + op1 + " points out of 10");

			int op2 = p2.displayQuizPoints(10,-2);

			System.out.println("Participant2 has got: " + op2 + " points out of 10");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
