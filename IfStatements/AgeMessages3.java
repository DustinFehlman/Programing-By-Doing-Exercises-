import java.util.Scanner;
import static java.lang.System.*;

public class AgeMessages3
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print( "Your name: " );
		String name = keyboard.next();
		
		out.print( "Your age: " );
		int age = keyboard.nextInt();
		
		out.println();
		
		if ( age < 16 )
			out.println( "You can't drive, " + name );
			
		if ( age >= 16 && age <= 17 )
			out.println( "You can drive but not vote, " + name );
			
		if ( age >= 18 && age <= 24 )
			out.println( "You can vote but not rent a car, " + name );
			
		if (age >= 25 )
			out.println( "You can pretty much do anything! " );
	}
}