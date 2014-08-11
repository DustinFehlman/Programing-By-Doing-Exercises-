import java.util.Random;
import static java.lang.System.*;

public class BabyBlackjack
{
	public static void main( String[] args)
	{
		
		Random cards = new Random();
		
		out.println("Baby Blackjack!");
		
		int humanCard1 = cards.nextInt(10), humanCard2 = cards.nextInt(10), compCard1 = cards.nextInt(10),
		compCard2 = cards.nextInt(10);
		
		int humanTotal = humanCard1 + humanCard2, compTotal = compCard1 + compCard2;
		
		out.println();
		out.println("You drew a " + humanCard1 + " and " + humanCard2 );
		out.println("Your total is " + humanTotal );
		
		out.println();
		out.println("The dealer has " + compCard1 + " and " + compCard2 );
		out.println("Dealer's total is " + compTotal );
		
		if( humanTotal > compTotal )
			out.println("\nYou win!");
		else
			out.println("\nDealer wins :(");
	}
}
		
		 