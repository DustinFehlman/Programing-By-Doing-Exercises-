import java.util.Scanner;
import static java.lang.System.*;

public class CollatzSequence
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print ("Starting number: ");
		int userNumber = keyboard.nextInt(), stepCount = 0, largestValue = 0;
		
		do
		{
			stepCount++;
			if( userNumber %2 == 0 )
			{
				userNumber = userNumber / 2;
				out.print(+ userNumber );
			}
			else
			{
				userNumber = (userNumber * 3) + 1;
				out.print( userNumber );
			}
			out.print("\t");
			if( userNumber > largestValue )
				largestValue = userNumber;	
		} while  (userNumber != 1 );
		
		out.println();
		out.println("Terminated after " + stepCount + " steps. The largest value was " + largestValue + "."s);
	}
}
			
				