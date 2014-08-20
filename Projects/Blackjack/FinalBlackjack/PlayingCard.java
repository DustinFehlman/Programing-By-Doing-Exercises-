import java.util.Random;

public class PlayingCard {

	public int cardValue;
	public String cardSuit;
	
		public PlayingCard(String suit, int value) {
		cardSuit = suit;
		cardValue = value;
		//System.out.println( value);
		//System.out.println( value + " of " + suit );
	}
	
	public static int dealCard() {
		Random r = new Random();
		
		int value = 2 + r.nextInt(9);
		String suit = randomSuit();
		
		return (value);
		
	}
			//Function to include suits. Giving the card some suits. 0 = clubs, 1 = hearts , 2 = spades , 3 = diamonds
	public static String randomSuit()
	{
		Random suits = new Random();
		int cardSuit = suits.nextInt(3);
		String suit = "";
		if (cardSuit == 0)
			suit = "clubs";
		if (cardSuit == 1)
			suit = "hearts";
		if (cardSuit == 2)
			suit = "spades";
		if (cardSuit == 3)
			suit = "diamonds";
		return (suit);
	}
		
}