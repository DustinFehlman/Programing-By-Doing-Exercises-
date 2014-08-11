import java.util.Scanner;
import java.util.Random;

public class HiLoLimited
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int number = 1 + r.nextInt(100);

		System.out.println ( " I am thinking of a number between 1-100. Try to guess it." );
		System.out.print( "First guess: " );
		int userGuess = keyboard.nextInt();

		System.out.println();
		
		int guessAmounts = 1, maxGuesses = 7 ;
		
		while ( userGuess != number && guessAmounts < maxGuesses )
		{
				guessAmounts++;
			if ( number < userGuess )
			{
				System.out.println( "Sorry, you are too high." );
				
				System.out.print( "Guess #" + guessAmounts + ": " );
				userGuess = keyboard.nextInt(); 
			}
			if ( number > userGuess )
			{
				System.out.println( "Sorry, you are too low." );
				
				System.out.print( "Guess #" + guessAmounts + ": " );
				userGuess = keyboard.nextInt();
			}
		}
		
		if (userGuess == number)
			System.out.println( "You guessed it! What are the odds?!?" );
		else 
			System.out.println( "Sorry, you didn't guess it in " + maxGuesses + " tries. You lose!" );
	}
}