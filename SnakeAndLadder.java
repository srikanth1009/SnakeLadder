package SnakeLadder;

public class SnakeAndLadder {
	static int player = 1;
	static int player1_position;
	static int player2_position;
	static int moveConditions = 0;

	public static void main(String[] args) {
		int dicerolls = SnakeAndLadder.diceRoll();
		int dice = 0;

		while (player1_position != 100 && player2_position != 100) {
			dice++;
			dicerolls = SnakeAndLadder.diceRoll();
			moveConditions = SnakeAndLadder.moveCondition();

			System.out.println("******PLAYER******* :- " + player);
			System.out.println("dice roll " + dicerolls);
			if (player == 1) {
				if (moveConditions == 1) {
					player = 2;
				}
				player1_position = SnakeAndLadder.position(dicerolls, player1_position);
				System.out.println("person 1 position" + player1_position);
			} else {
				if (moveConditions == 1) {
					player = 1;
				}
				player2_position = SnakeAndLadder.position(dicerolls, player2_position);
				System.out.println("person 2 position" + player2_position);
			}
			if (player == 1) {
				player = 2;
			} else {
				player = 1;
			}
		}
		System.out.println("number of dice  roll " + dice);
		int win1 = win(player1_position, player2_position);

	}

	public static int diceRoll() {
		int diceRoll = 1 + (int) Math.floor(Math.random() * 10) % 6;
		return diceRoll;
	}

	public static int moveCondition() {
		int moveCondition = (int) Math.floor(Math.random() * 10) % 3;
		return moveCondition;
	}

	public static int position(int dicevalue, int player_position) {

		switch (moveConditions) {
		case 0:
			System.out.println("no play " + player_position);
			break;
		case 1:
			if ((player_position + dicevalue) > 100) {
				break;
			} else {
				player_position += dicevalue;
				System.out.println("ladder" + player_position);

			}
			break;
		default:
			// System.out.println(player1_position);
			if ((player_position - dicevalue) <= 0) {
				player_position = 0;
			} else {
				player_position -= dicevalue;
				System.out.println("sanke" + player_position);
			}

			break;
		}

		return player_position;
	}

	public static int win(int player1_position, int playe2_position) {
		if (player1_position == 100) {
			System.out.println("player 1 win ");

		} else if (player2_position == 100) {
			System.out.println("player 2 win");

		}
		return 0;
	
}
}