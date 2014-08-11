import java.util.Scanner;
import static java.lang.System.*;

public class HowOldAreYou2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		out.print( "Hey, what's your name? " );
		name = keyboard.next();
		
		out.print( "Ok, " + name + ", how old are you? ");
		age = keyboard.nextInt();
		
		out.println();
		
		if ( age > 25 )
			out.println( "You can do pretty much anything.");
		else if ( age >= 18 )
			out.println( "You can vote but not rent a car." );
		else if ( age >= 17 )
			out.println( "You can drive but not vote." );
		else 
			out.println( "You cant drive." );
			
	}
}