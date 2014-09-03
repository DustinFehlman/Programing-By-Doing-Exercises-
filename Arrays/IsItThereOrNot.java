import java.util.Scanner;
import java.util.Random;

public class IsItThereOrNot
{
	public static void main ( String [] args )
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		int amount = 0;
		boolean isIn = false;
		
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
			if ( a1 == value)
				isIn = true;
		}
		
		if(isIn == true)
		{
			System.out.println(value + " is in the array.");
		}
		else
		{
			System.out.println(value + " is not in the array.");
		}		
	}
}