package final_project;

import java.util.Scanner;

public class PlayWar {

	static Scanner kb = new Scanner(System.in);

	public void play() {
		Deck one = new Deck();
		Player p1 = new Player(), p2 = new Player();

		System.out
				.println("This is an automated version of the game of War.\nGame is played against CPU.\nGood Luck!\n");

		System.out.print("Enter name of Player 1: ");
		String name = "";
		name = kb.next();
		p1.setName(name);
		p2.setName("CPU");

		one.shuffle();

		System.out.println();

		for (int i = 0; i < 26; i++) {
			p1.draw(one);
			p2.draw(one);
		}

		int index = 1;
		for (int i = 0; i < 26; i++) {
			Card c = null, c2 = null;

			c = p1.drawTopCardofPlayerHand();
			c2 = p2.drawTopCardofPlayerHand();

			int player1 = p1.flip().getValue();
			int player2 = p2.flip().getValue();
			System.out.println("Hand: " + index);

			if (player1 > player2) {
				System.out.print(p1.getName());
				for (int i2 = 0; i2 < 25 - p1.getName().length(); i2++) {
					System.out.print(" ");
				}
				System.out.println(p2.getName());
				System.out.print(c.describe());
				for (int i3 = 0; i3 < 25 - c.describe().length(); i3++) {
					System.out.print(" ");
				}
				System.out.println(c2.describe());

				p1.incrementScore();

				if (p1.getScore() < 10) {
					System.out.print("Score: " + p1.getScore());
					for (int x = 0; x < 17; x++) {
						System.out.print(" ");
					}
					System.out.println("Score: " + p2.getScore());
				} else {
					System.out.print("Score: " + p1.getScore());
					for (int x = 0; x < 16; x++) {
						System.out.print(" ");
					}
					System.out.println("Score: " + p2.getScore());

				}
				System.out.println(p1.getName() + "'s Card is Higher");
			}

			else if (player1 < player2) {
				System.out.print(p1.getName());
				for (int i4 = 0; i4 < 25 - p1.getName().length(); i4++) {
					System.out.print(" ");
				}
				System.out.println(p2.getName());
				System.out.print(c.describe());
				for (int i5 = 0; i5 < 25 - c.describe().length(); i5++) {
					System.out.print(" ");
				}
				System.out.println(c2.describe());

				p2.incrementScore();

				if (p1.getScore() < 10) {
					System.out.print("Score: " + p1.getScore());
					for (int x = 0; x < 17; x++) {
						System.out.print(" ");
					}
					System.out.println("Score: " + p2.getScore());
				} else {
					System.out.print("Score: " + p1.getScore());
					for (int x = 0; x < 16; x++) {
						System.out.print(" ");
					}
					System.out.println("Score: " + p2.getScore());
				}
				System.out.println("CPU's Card is Higher");

			}

			else {
				System.out.print(p1.getName());
				for (int i6 = 0; i6 < 25 - p1.getName().length(); i6++) {
					System.out.print(" ");
				}
				System.out.println(p2.getName());
				System.out.print(c.describe());
				for (int i7 = 0; i7 < 25 - c.describe().length(); i7++) {
					System.out.print(" ");
				}
				System.out.println(c2.describe());

				if (p1.getScore() < 10) {
					System.out.print("Score: " + p1.getScore());
					for (int x = 0; x < 17; x++) {
						System.out.print(" ");
					}
					System.out.println("Score: " + p2.getScore());
				} else {
					System.out.print("Score: " + p1.getScore());
					for (int x = 0; x < 16; x++) {
						System.out.print(" ");
					}
					System.out.println("Score: " + p2.getScore());
				}
				System.out.println("It's a tie");
			}

			System.out.println();
			index++;
		}
		System.out.println("Score");
		p1.describe();
		p2.describe();
		System.out.println("Ties: " + (26-(p1.getScore() + p2.getScore())));
		System.out.println();

		if (p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " Wins!");
		} else if (p1.getScore() < p2.getScore()) {
			System.out.println(p2.getName() + " Wins!");
		} else {
			System.out.println("It's a Draw!");
		}

	}

}
