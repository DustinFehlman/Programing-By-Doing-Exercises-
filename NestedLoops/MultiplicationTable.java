import static java.lang.System.*;

public class MultiplicationTable
{
	public static void main (String [] args)
	{
		out.print("x| ");
		
		for (int table = 1; table <=9; table++)
		{
			out.print(table + "\t");
		}
			out.println();
			out.println("=+====================================================================");
			for ( int y = 1; y <=12 ; y++)
			{	
				out.print(y + "| ");
			
					
				for (int x = 1; x <= 9 ; x++)
				{
					out.print(x*y + "\t");
				
				}
				out.println();
			}
		
	}
}
	