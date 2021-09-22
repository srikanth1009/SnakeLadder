package SnakeLadder;
public class PositionAfterEverydie {
	public static void main(String[] args) {
		int position = 0;
		int diceRollNo = 0;
		while (position != 100) {
			diceRollNo++;
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
			System.out.println(diceRollNo);
			System.out.println("Player Position After Dice Roll " + position);
		}
		System.out.println("Number Of Dice Roll To Win " + diceRollNo);
	}
}