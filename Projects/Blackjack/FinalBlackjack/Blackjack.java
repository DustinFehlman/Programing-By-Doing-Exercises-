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
			int playerCard1 = PlayingCard.dealCard();
			int playerCard2 = PlayingCard.dealCard();
			int dealerCard1 = PlayingCard.dealCard();
			int dealerCard2 = PlayingCard.dealCard();
			int playerTotal = playerCard1 + playerCard2;
			int dealerTotal = dealerCard1 + dealerCard2;
			int hitCard = PlayingCard.dealCard();
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
			out.print("You get a " + playerCard1 + " of " + PlayingCard.randomSuit());
			out.print(" and a " + playerCard2 + " of " + PlayingCard.randomSuit() + "." );
			out.println(" Your total is " + playerTotal + ".");
			
			out.println("\nThe dealer has a " + dealerCard1 + " of " + PlayingCard.randomSuit() +" showing, and a hidden card.");
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
					out.println( "You drew a " + hitCard + " of " + PlayingCard.randomSuit() + ".");
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
				out.println("His hidden card was a " + dealerCard2 + " of " + PlayingCard.randomSuit() + ".");
				out.println("His total was " + dealerTotal + ".");
						
				//Dealer loop on hit 16 and lower
				do
				{
					if( dealerTotal <= 16 )
					{
						hitCard = 2 + cards.nextInt(9);
						dealerTotal = dealerTotal + hitCard;
						out.println("Dealer chooses to hit.");
						out.println("Dealer draws a " + hitCard + " of " + PlayingCard.randomSuit() + ".");
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
							
}
					
			
			
				