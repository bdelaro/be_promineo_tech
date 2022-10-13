package final_project;

import java.util.HashMap;
import java.util.Map;

//import java.util.ArrayList;
//import java.util.List;

public class Card {

	private final int value;
	private final String rank;
	private final String suit;
	private final String name;

	public final static String[] suits = { "Diamonds", "Hearts", "Clubs", "Spades" };
	public final static String[] ranks = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Jack", "Queen", "King", "Ace" };
	private Map<String, Integer> cardValue = new HashMap<>();

	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		this.name = this.rank + " of " + this.suit;
		initializeMap();
		this.value = cardValue.get(rank);
	}

	public int getValue() {
		return value;
	}

	public String describe() {
		return name;

	}

	private void initializeMap() {

		for (int i = 0; i < ranks.length; i++) {
			cardValue.put(ranks[i], i + 2);
		}

	}

	
}
