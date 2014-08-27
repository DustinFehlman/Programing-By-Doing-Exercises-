import static java.lang.System.*;

public class NumberPuzzles4
{
	public static void main (String [] args)
	{
		for(int x1 = 0; x1 < 100; x1++)
		{
			for(int x2 = 0; x2 < 100; x2++)
			{
				for(int x3 = 0; x3 < 100; x3++)
				{
					for(int x4 = 0; x4 < 100; x4++)
					{
						if( x1+x2+x3+x4 == 45 && (x1 + 2 == x2 -2  && x2 -2 == x3 * 2 && x3 * 2 == x4 / 2))
							out.println(x1 + " " + x2 + " " + x3 + " " + x4);
					}
				}
			}
		}
	}
} 