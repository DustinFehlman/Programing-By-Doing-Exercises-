import java.util.Random;

public class LocatingLargest
{
	public static void main ( String [] args )
	{
		Random r = new Random();
		int x;
		int largestValue = 0;
		int slot = 0;
		
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
			{
				largestValue = a1;	
			}
			
		}
		
		for( x = 0; x < array1.length; x++)
		{
			if(array1 [x] == largestValue)
			{
				slot = x;
			}			
		}
		System.out.println();
		System.out.println("The largest value is " + largestValue );
		System.out.println("It is in slot " + slot);
	}
}
		
		