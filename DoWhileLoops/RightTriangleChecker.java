import java.util.Scanner;
import static java.lang.System.*;

public class RightTriangleChecker
{
		public static void main ( String[] args )
		{
			Scanner keyboard = new Scanner(System.in);
		
			out.println( "Enter three integers:");
			out.print("Side 1: ");
			int firstNumber = keyboard.nextInt(), secondNumber, thirdNumber;
		
			do
			{
				out.print("Side 2: ");
				secondNumber = keyboard.nextInt();
				if ( firstNumber > secondNumber )
					out.println( secondNumber+ " is smaller than " +firstNumber+ ". Try again. "); 
			
			} while ( firstNumber > secondNumber );
		
			do
			{
				out.print("Side 3: ");
				thirdNumber = keyboard.nextInt();
				if ( secondNumber > thirdNumber )
					out.println( thirdNumber+ " is smaller than " +secondNumber+ ". Try again. "); 
			
			} while ( thirdNumber < secondNumber );
		
			out.println();
		
			out.println("Your three sides are " +firstNumber+ " " +secondNumber+ " " +thirdNumber );
		
			int squaredValue1 = (firstNumber * firstNumber);
			int squaredValue2 = (secondNumber * secondNumber);
			int squaredValue3 = (thirdNumber * thirdNumber);
			boolean rightTriangle = ( (squaredValue1 + squaredValue2) == squaredValue3);
		
			if(rightTriangle == true)
				out.println( "These sides do make a right triangle!");
			else
				out.println( "Nope, these sides do not make a right triangle!");
			
		}
}

		