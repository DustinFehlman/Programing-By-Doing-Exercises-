import java.util.Random;
public class BasicArrays3
{
	public static void main ( String[] args )
	{
		int[] RandomNumbers = new int [1000];
		Random r = new Random ();
		
		for( int x = 0; x < RandomNumbers.length; x++)
		{
			RandomNumbers[x] = 10 + r.nextInt(89);
			System.out.print(RandomNumbers[x] + ", ");
		}
	}
}