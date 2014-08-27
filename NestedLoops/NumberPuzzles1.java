import static java.lang.System.*;

public class NumberPuzzles1
{
	public static void main (String [] args)
	{
		for( int x = 10; x < 100;  x++)
		{
			for( int y = 10; y < 100; y++)
			{
				if( x + y == 60 && x - y == 14)
				{
					out.println(x + " " + y);
				}
			}
		}
	}
}