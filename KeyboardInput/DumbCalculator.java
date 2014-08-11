import java.util.Scanner;

public class DumbCalculator
{
	public static void main( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Double value1, value2, value3, finalValue;
		
		System.out.print( "\nWhat is your first number? " );
		value1 = keyboard.nextDouble();
		
		System.out.print( "What is your second number? " );
		value2 = keyboard.nextDouble();
		
		System.out.print( "What is your third number? " );
		value3 = keyboard.nextDouble();
		
		finalValue = ( value1 + value2 + value3 ) / 2;
		
		System.out.println( "( " + value1 + " + " + value2 + " + " + value3 + " ) / 2 is... " + finalValue );
		
	}
}
		
		
		