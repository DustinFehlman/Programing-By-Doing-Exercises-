import java.util.Scanner;
import static java.lang.System.*;

public class AddingValuesInALoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		out.println( "I will add up the numbers you give me." );
		out.print( "Number: ");
		int userInput = keyboard.nextInt();
		int totalValue = 0;
		while ( userInput != 0 )
		{
			totalValue = userInput + totalValue;
			out.println("The total so far is " + totalValue );
			out.print( "Number: " );
			userInput = keyboard.nextInt();
		}
		out.println();
		out.println( "The total is " + totalValue );
	}
}
	