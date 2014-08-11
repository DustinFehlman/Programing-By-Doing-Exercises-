import java.util.Scanner;
import static java.lang.System.*;

public class GenderGame
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print( "What is you gender (M or F): " );
		String gender = keyboard.next();
		
		out.print( "First Name: " );
		String firstName = keyboard.next();
		
		out.print( "Last Name: " );
		String lastName = keyboard.next();
		
		out.print( "Age: " );
		int age = keyboard.nextInt();
		
		out.println();
		
		if( gender.equals("F") && age >= 20 )
		{
			out.print( "Are you married, " + firstName + " (y or n)? " );
			String married = keyboard.next();
		
			if( married.equals("y") )
				out.println( "Then I shall call you Mrs. " + lastName );
			else
				out.println( "Then I shall call you Ms. " + lastName );
		}
		if ( gender.equals("F") && age < 20 )
			out.println( "Then I shall call you " + firstName + " " + lastName );
		
		if( gender.equals("M") && age >= 20 )
			out.println( "Then I shall call you Mr. " + lastName );
			
		if( gender.equals("M") && age < 20 )
			out.println( "Then I shall call you " + firstName + " " + lastName );
	}
}
	
			
				
		
		
		
		 
		