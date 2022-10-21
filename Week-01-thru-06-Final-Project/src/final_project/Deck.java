package final_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	public List<Card> cards = new ArrayList<>();

	public Deck() {
		Card[] c = new Card[52];
		int index = 0;
		for (int x = 0; x < Card.suits.length; x++) {
			for (int y = 0; y < Card.ranks.length; y++) {
				c[index] = new Card(Card.ranks[y], Card.suits[x]);
				index++;
			}
		}
		for (int i = 0; i < 52; i++) {
			cards.add(i, c[i]);
		}

	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		Card c = cards.get(cards.size() - 1);
		cards.remove(cards.size() - 1);

		return c;
	}

}