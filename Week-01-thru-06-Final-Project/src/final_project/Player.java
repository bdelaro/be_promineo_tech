package final_project;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> playerHand = new ArrayList<>();
	private int score;
	private String name = "";

	public Player() {
		this.score = 0;
	}

	public void describe() {
		System.out.print(name + ": ");
		System.out.println(score);

	}

	public Card flip() {

		Card c = playerHand.get(playerHand.size() - 1);
		playerHand.remove(playerHand.size() - 1);

		return c;
	}

	public Card drawTopCardofPlayerHand() {
		Card c = null;
		if (!playerHand.isEmpty()) {
			c = playerHand.get(playerHand.size() - 1);
		} else {
			System.out.println("List is empty.");
		}
		return c;

	}

	public void draw(Deck d) {
		this.playerHand.add(d.draw());

	}

	public void incrementScore() {
		score++;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getPlayerHand() {
		return playerHand;
	}

	public void getCardFromHand(int i) {
		if (!playerHand.isEmpty()) {
			System.out.print(playerHand.get(i).describe() + ", ");
		} else {
			System.out.println("List is empty.");
		}
	}
}
