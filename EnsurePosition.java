package SnakeLadder;

public class EnsurePosition {
	public static void main(String[] args) {
		int position = 0;
		while (position != 100) {
			int dieRoll = 1 + (int) Math.floor(Math.random() * 10) % 6;
			System.out.println("Die Rolled:" + dieRoll);

			int checkOption = (int) Math.floor(Math.random() * 10) % 3;
			if (checkOption == 0) {
				System.out.println("No Play");
			} else if (checkOption == 1) {
				System.out.println("Ladder Comes");
				if (position + dieRoll <= 100) {
					position += dieRoll;
				} else if (position + dieRoll > 100) {
					continue;
				}
			} else {
				System.out.println("Snake Comes");
				if ((position - dieRoll) < 0) {
					position = 0;
				} else {
					position -= dieRoll;
				}
			}
		}
	}
}
