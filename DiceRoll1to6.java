package SnakeLadder;

public class DiceRoll1to6 {
	public static void main(String[] args) {
		int position = 0;
		int dieRoll = 1 + (int) Math.floor(Math.random() * 10) % 6;
		System.out.println("Die Rolled:" + dieRoll);
	}
}
