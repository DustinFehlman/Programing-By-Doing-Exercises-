public class SortingValues
{
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		
		for ( int i = 0 ; i < arr.length ; i++ )
		{
			for ( int check = 0; check < arr.length ; check++)
			{
				if ( arr[check] > arr[i] )
				{
					int temp1, temp2;
					temp1 = arr[check];
					temp2 = arr[i];
					arr[i] = temp1;
					arr[check] = temp2;	
					
				}
			}
		}
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}