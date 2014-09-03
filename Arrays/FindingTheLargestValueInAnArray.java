import java.util.Random;

public class FindingTheLargestValueInAnArray
{
	public static void main ( String [] args )
	{
		Random r = new Random();
		int x;
		int largestValue = 0;
		
		int[] array1 = new int [10];
		
		for( x = 0; x < array1.length; x++)
		{
			array1 [x] = 1 + r.nextInt(100);
			
		}
		
		System.out.print("Array: ");
		
		for( int a1 : array1 )
		{
			
			System.out.print( a1 + " ");
			
			if( a1 > largestValue)
				largestValue = a1;
		}
		
		System.out.println("\nThe largest value is " + largestValue );
	}
}
		
		