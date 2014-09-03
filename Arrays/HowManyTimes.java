import java.util.Scanner;
import java.util.Random;

public class HowManyTimes
{
	public static void main ( String [] args )
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		int amount = 0;
		
		int[] array1 = new int [10];
		
		for( int x = 0; x < array1.length; x++)
		{
			array1 [x] = 1 + r.nextInt(49);
			
		}
		
		System.out.print("Array: ");
		
		for( int a1 : array1 )
		{
			System.out.print( a1 + " ");
		}
		
		System.out.print("\nValue to find: ");
		int value = kb.nextInt();
		
		for( int a1 : array1 )
		{
			if ( a1 == value )
			{
				amount++ ;
			}
		}
		
		System.out.println("\n" + value + " was found " + amount + " times.");
		
	}
}