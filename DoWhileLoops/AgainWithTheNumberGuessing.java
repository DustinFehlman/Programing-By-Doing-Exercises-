import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class AgainWithTheNumberGuessing
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
		
		int guessAmount = 1;

		do
		{
			guessAmount++;
			if ( answer != secretNumber )
			{
				out.print( "Nope! Too bad, try again!" );
				answer = keyboard.nextInt();
			}
		} while ( answer != secretNumber ); 
		
		out.println( "Great job! You must be a mind reader. It only took you " + guessAmount + " tries!" );
		
	}
}