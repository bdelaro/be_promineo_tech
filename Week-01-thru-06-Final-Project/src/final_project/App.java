package final_project;



public class App {

	public static void main(String[] args) {
		
		Deck one = new Deck();
		for(int i = 0;i<one.cards.size();i++) {
			System.out.println(one.cards.get(i).describe());
		}
		System.out.println(one.cards.get(2).getValue());
		one.shuffle();
		for(int i = 0;i<one.cards.size();i++) {
			System.out.println(one.cards.get(i).describe());
		}
	
	}

}
