import static java.lang.System.*;

public class GettingIndividualDigits
{
	public static void main (String [] args)
	{
		for ( int x = 1; x < 10; x++ )
		{
			for (int y = 0; y < 10; y++ )
			{
				out.println(x + "" + y + ", " + x + "+" + y + " = " + x+y);
			}
		}
	}
}
				