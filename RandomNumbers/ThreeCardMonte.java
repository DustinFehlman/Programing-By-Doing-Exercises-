import static java.lang.System.*;
import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte
{
	public static void main ( String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int winningCard = 1 + r.nextInt(3);
		
		out.println( "Welcome to Three Card Monte!" );
		
		out.println( "Which one is the ace?" );
		out.println();
		
		out.println( "\t\t##  ##  ##" );
		out.println( "\t\t##  ##  ##" );
		out.println( "\t\t1   2   3 " );
		
		out.print("\n> ");
		int userGuess = keyboard.nextInt();
		
		out.println();
		
		if ( userGuess == winningCard )
			out.println( "You got it!");
		else
			out.println( "Sorry! The winner was " + winningCard );
		
		out.println();
		
		if ( winningCard == 1 )
		{
			out.println( "\t\tAA  ##  ##" );
			out.println( "\t\tAA  ##  ##" );
			out.println( "\t\t1   2   3 " );
		}
		else if ( winningCard == 2 )
		{
			out.println( "\t\t##  AA  ##" );
			out.println( "\t\t##  AA  ##" );
			out.println( "\t\t1   2   3 " );
		}
		else
		{
			out.println( "\t\t##  ##  AA" );
			out.println( "\t\t##  ##  AA" );
			out.println( "\t\t1   2   3 " );
		}
	}
}
			
		