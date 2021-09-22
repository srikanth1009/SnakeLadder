package SnakeLadder;

public class CheckingOptions {
	public static void main(String[] args) {
		int position = 0;
		int dieRoll = 1 + (int) Math.floor(Math.random() * 10) % 6;
		System.out.println("Die Rolled:" + dieRoll);
		int checkOption = (int) Math.floor(Math.random() * 10) % 3;
		if (checkOption == 0) {
			System.out.println("No Play");
		} else if (checkOption == 1) {
			System.out.println("Ladder Comes");
			position += dieRoll;
		} else {
			System.out.println("Snake Comes");
			position -= dieRoll;
		}
	}
}
