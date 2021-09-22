package SnakeLadder;

public class TwoplayersPosition {
	public static void main(String[] args) {
		int person1_position = 0, person2_position = 0, flag = 0;
		int diceRollNo = 0;
		while (person1_position != 100 && person2_position != 100) {
			diceRollNo++;
			int dieRoll = 1 + (int) Math.floor(Math.random() * 10) % 6;
			System.out.println("Die Rolled:" + dieRoll);

			if (flag == 0) {
				int checkOption = (int) Math.floor(Math.random() * 10) % 3;
				if (checkOption == 0) {
					System.out.println("No Play");
				} else if (checkOption == 1) {
					flag = 1;
					System.out.println("Ladder Comes");
					if (person1_position + dieRoll <= 100) {
						person1_position += dieRoll;

					} else if (person1_position + dieRoll > 100) {
						continue;
					}
				} else {
					System.out.println("Snake Comes");
					if ((person1_position - dieRoll) < 0) {
						person1_position = 0;
					} else {
						person1_position -= dieRoll;
					}
				}
				System.out.println(diceRollNo);
				System.out.println(
						"Player person1_position After Dice Roll " + person1_position + " " + person2_position);
				if (person1_position == 100) {
					System.out.println("persom one win first");
				}
			} else {
				int checkOption = (int) Math.floor(Math.random() * 10) % 3;
				if (checkOption == 0) {
					System.out.println("No Play");
				} else if (checkOption == 1) {
					flag = 0;
					System.out.println("Ladder Comes");
					if (person2_position + dieRoll <= 100) {
						person2_position += dieRoll;

					} else if (person2_position + dieRoll > 100) {
						continue;
					}
				} else {
					System.out.println("Snake Comes");
					if ((person2_position - dieRoll) < 0) {
						person2_position = 0;
					} else {
						person2_position -= dieRoll;
					}
				}
				System.out.println(diceRollNo);
				System.out.println("Player Position After Dice Roll " + person1_position + " " + person2_position);
				if (person2_position == 20) {
					System.out.println("person two win first");
				}
			}
			if (flag == 0) {
				flag = 1;
			} else {
				flag = 0;
			}
		}
		System.out.println("Number Of Dice Roll To Win " + diceRollNo);
	}
}
