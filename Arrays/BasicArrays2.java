import java.util.Random;
public class BasicArrays2
{
	public static void main ( String[] args )
	{
		int[] slots = new int [10];
		Random r = new Random ();
		
		
		for( int x = 0; x < slots.length; x++)
		{
			slots[x] = 1 + r.nextInt(100);
			System.out.println("Slot " + x + " contains a " + slots[x] );
		
		}
	}
}