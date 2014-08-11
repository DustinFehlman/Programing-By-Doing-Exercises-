public class NumbersAndMath
{
	public static void main( String[] args )
	{
		//Prints out string
		System.out.println( "I will now count my chickens:" );
		//Prints out string and add 25 and 30, then divides the sum by 6 and prints 
		//the final value
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		//Prints out string and subtract 25 from 100, then multiplies by 3, then divides 
		//by 4, and prints the remainder
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
		// Prints string
		System.out.println( "Now I will count the eggs:" );
		//Adds 3,2,1, subtracts 5, adds 4, divides by 2 and produces a remainder. 
		//Subtracts 1 from remainder, and divides it by 4 and adds 6.
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 -1.0 / 4.0 + 6.0 );
		//Prints string
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" ); 
		// Checks if 7 is less than -2. Prints out false
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
		//Prints string and prints sum of 3 + 2
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		//Prints string and difference of 5-7
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
		//Prints string
		System.out.println( "Oh, that's why it's false." );
		//Prints string
		System.out.println( "How about some more." );
		// Prints string. Checks if 5 is greater than -2. Prints true
		System.out.println( "It is greater? " + ( 5.0 > -2.0 ) );
		// Prints string. Checks if 5 is greater than of equal to -2. Prints true.
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		//Prints string. Checks if 5 is greater than or equal to -2. Prints false.
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}