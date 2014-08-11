import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class NumberGuess
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int secretNumber = 1 + r.nextInt(10);

		out.println( "The better number guessing game ever!" );

		out.print( "\nI am thinking of a number from 1 - 10, try to guess it ! " );
		int answer = keyboard.nextInt();

		out.println();

		if ( answer != secretNumber )
			out.println( "Nope! It was " + secretNumber + "! Too bad, play again!" );
		else
			out.println( "Great job! You must be a mind reader." );
	}
}