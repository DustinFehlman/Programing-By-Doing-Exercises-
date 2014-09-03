public class BasicArray1
{
	public static void main ( String[] args )
	{
		int[] slots = new int [10];
		
		for( int x = 0; x < slots.length; x++)
		{
			slots[x] = -113;
			System.out.println("Slot " + x + " contains a " + slots[x] );
		
		}
	}
}