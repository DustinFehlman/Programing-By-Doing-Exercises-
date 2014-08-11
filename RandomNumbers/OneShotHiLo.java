import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int number = 1 + r.nextInt(100);
		
		System.out.println ( " I am thinking of a number between 1-100. Try to guess it." );
		System.out.print( "> " );
		int userGuess = keyboard.nextInt();
		
		System.out.println();
		
		if ( number < userGuess )
			System.out.println( "Sorry, you are too high. I was thinking of " + number );
		else if ( number > userGuess )
			System.out.println( "Sorry, you are too low. I was thinking of " + number );
		else 
			System.out.println( "You guessed it! What are the odds?!?" );
	}
}