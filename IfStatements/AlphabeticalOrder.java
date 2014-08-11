import java.util.Scanner;
import static java.lang.System.*;

public class AlphabeticalOrder
{
		public static void main( String[] args )
		{
			Scanner keyboard = new Scanner(System.in);
			
			out.print( "What's your last name? " );
			String name  = keyboard.nextLine();
			
			int c = name.compareToIgnoreCase("Carswell");
			int j = name.compareToIgnoreCase("Jones");
			int s = name.compareToIgnoreCase("Smith");
			int y = name.compareToIgnoreCase("Young");
			
			
			if( c < 0 )
			{
				out.println( "You don't have to wait long." );
			}
			else if ( j < 0 )
			{
				out.println( "That's not bad." );
			}
			else if (s < 0 )
			{
				out.println( "Looks like a bit of a wait." );
			}
			else if (y < 0 )
			{
				out.println( "It's gonna be a while." );
			}
			else
			{
				out.println( "You are not going anywhere for awhile, right?" );
			}
		}
}
				
				
				
			