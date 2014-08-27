import static java.lang.System.*;

public class BasicNestedLoops
{
	public static void main (String [] args)
	{
		for ( int x = 0; x <= 5 ; x++)
		{
			for ( int y = 0; y <= 5 ; y++)
			{
				out.print("("+ x + "," + y + ") ");
			}
			out.println();
		}
	}
}