package simpleQuizApplication;

//This is a quiz class. In this class we have 2 variables & 3 questions stored in an array.

abstract class Quiz {
	String partiName;
	String partiPoints;

	//Array storing 3 questions.
	String[] arr = { "First women president of India?", "Current Captain of ICT in ODI's?", "What is SDLC?" };

	//Maethod to calculate quiz points of a participant. It has 2 parameters no Of Que Attempt
	//& wrong Ans.
	public int displayQuizPoints(int noOfQueAttempt, int wrongAns) throws Exception {
		int points = noOfQueAttempt - wrongAns;
		if (points < 0) {
			throw new Exception("Marks cannot be -ve");
		} else if (points == 10) {
			System.out.println("Congratulations you have got 10 out of 10!");
		} else if (points > 10) {
			throw new Exception("Marks cannot be more than 10('Out of Limit!')");
		}
		return points;
	}
}
