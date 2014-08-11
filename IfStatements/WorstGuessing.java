import java.util.Scanner;
import static java.lang.System.*;

public class WorstGuessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int secretNumber = 7;
		
		out.println( "The worst number guessing game ever!" );
		
		out.print( "\nI am thinking of a number from 1 - 10, try to guess it ! " );
		int answer = keyboard.nextInt();
		
		out.println();
		
		if ( answer != secretNumber )
			out.println( "Nope! Too bad, play again!" );
		else
			out.println( "Great job! You must be a mind reader." );
	}
}