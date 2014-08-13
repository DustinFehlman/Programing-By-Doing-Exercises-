import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class Blackjack
{
	public static void main( String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Random cards = new Random();
		Random suits = new Random();
		
		out.println("Welcome to Casino El Dustin's game of Blackjack!");
		out.println();
		String playAgain;
		int bankRoll = 0;
		
		out.print("How much would you like to buy in for? $");
		bankRoll = kb.nextInt();
			
		//Loop whole game until player quits or runs out of money
		do
		{
			//Original cards pulled for player and dealer, and orignal totals.
			int playerCard1 = 2 + cards.nextInt(9), playerCard2 = 2 + cards.nextInt(9);
			int dealerCard1 = 2 + cards.nextInt(9), dealerCard2 = 2 + cards.nextInt(9);
			int playerTotal = playerCard1 + playerCard2;
			int dealerTotal = 14; //dealerCard1 + dealerCard2;
			int hitCard = 2 + cards.nextInt(9);
			int betAmount = 0;
			
			
			out.println("You have $" +bankRoll+ " to play with.");
			out.print("How much would you like to bet this round? $");
			betAmount = kb.nextInt();
			
			//Loop to keep bets from exceeding the  bankroll.
			while ( betAmount > bankRoll )
			{
				out.println("You do not have enough in your bank roll to place a wager that high!");
				out.print("Please bet again. $");
				betAmount = kb.nextInt();
			}
			randomSuit();	
			out.print("You get a " + playerCard1 + " of " + randomSuit());
			out.print(" and a " + playerCard2 + " of " + randomSuit() + "." );
			out.println(" Your total is " + playerTotal + ".");
			
			out.println("\nThe dealer has a " + dealerCard1 + " of " + randomSuit() +" showing, and a hidden card.");
			out.println("His total is hidden as well.");
			String playerChoice;
			
			//Loop until player stays or bust
			do
			{
				out.print("\nWould you like to \"hit\" or \"stay\"? ");
				playerChoice = kb.next();
			
				if( playerChoice.equalsIgnoreCase("hit") )
				{
					playerTotal = playerTotal + hitCard;
					out.println( "You drew a " + hitCard + " of " + randomSuit() + ".");
					out.println( "Your total is " + playerTotal + ".");
				} 
				else if( playerTotal <= 21)
				{
					out.println("Player stays");
				}	 
				
			} while(playerTotal < 21 && playerChoice.equalsIgnoreCase("hit") );
			
			if(playerTotal > 21)
			{
				out.println("Player bust. Dealer wins");
				out.println("You lost $" +betAmount+ ".");
				bankRoll -= betAmount;
				
			}
			else
			{
				out.println("\nOkay, dealer's turn.");
				out.println("His hidden card was a " + dealerCard2 + " of " + randomSuit() + ".");
				out.println("His total was " + dealerTotal + ".");
						
				//Dealer loop on hit 16 and lower
				do
				{
					if( dealerTotal <= 16 )
					{
						hitCard = 2 + cards.nextInt(9);
						dealerTotal = dealerTotal + hitCard;
						out.println("Dealer chooses to hit.");
						out.println("Dealer draws a " + hitCard + " of " + randomSuit() + ".");
						out.println("His total is " + dealerTotal + ".");
					}
					if (dealerTotal > 21)
					{
						out.println("Dealer bust. Player wins");
						bankRoll += (betAmount * 2);
					}
					else if (dealerTotal > 16)
					{
						out.println("Dealer stays.");	
					}			
				}while ( dealerTotal < 17 );
				
				if ( dealerTotal > playerTotal && dealerTotal <= 21 )
				{
					out.println("\nDealer total is " + dealerTotal + ".");
					out.println("Player total is " + playerTotal + ".");
					out.println("Dealer	wins.");
					out.println("You lost " +betAmount+ ".");
					bankRoll -= betAmount;
				}
				else if ( dealerTotal < playerTotal && playerTotal <= 21 )
				{
					out.println("\nDealer total is " + dealerTotal + ".");
					out.println("Player total is " + playerTotal + ".");
					out.println("Player wins!");
					out.println("You won $" + betAmount * 2 + "!");
					bankRoll += (betAmount * 2);
					
				}
				else if ( dealerTotal == playerTotal && dealerTotal <= 21 && playerTotal <= 21 )
				{
					out.println("Dealer wins the tie.");
					out.println("You lost $" +betAmount+ ".");
					bankRoll -= betAmount;
				}
			}
			out.println("\nYour bank roll is at $"+ bankRoll + ".");
			out.print("Would you like to play again? ");
			playAgain = kb.next();
			
			if(bankRoll <= 0 )
			{
				out.println("Please add more funds to your bank roll.");
			}

		} while (playAgain.equalsIgnoreCase("yes") && bankRoll > 0 );
	}
			//Function to include suits. Giving the card some suits. 0 = clubs, 1 = hearts , 2 = spades , 3 = diamonds
			public static String randomSuit()
			{
				Random suits = new Random();
				int cardSuits = suits.nextInt(3);
				String suit = "";
				if (cardSuits == 0)
					suit = "clubs";
				if (cardSuits == 1)
					suit = "hearts";
				if (cardSuits == 2)
					suit = "spades";
				if (cardSuits == 3)
				 	suit = "diamonds";
				return (suit);
			
	  		}
	  		
				
}
					
			
			
				