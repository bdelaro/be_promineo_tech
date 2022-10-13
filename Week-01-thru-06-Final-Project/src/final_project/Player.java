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

	}

	public void flip() {

	}

	public void draw() {

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

	public void setPlayerHand(List<Card> playerHand) {
		this.playerHand = playerHand;
	}


}
