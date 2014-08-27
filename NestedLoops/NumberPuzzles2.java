import static java.lang.System.*;
import java.util.Scanner;

public class NumberPuzzles2
{
	public static void main (String [] args)
	{
		Scanner kb =  new Scanner(System.in);
		int userChoice;
		do
		{
			out.println("\n1) Find two digit numbers <= 56 with sums of digits > 10");
			out.println("2) Find two digit number minus number reversed which equals sum of digits");
			out.println("3) Quit");
			out.print("\t>");
			userChoice = kb.nextInt();
			
			if(userChoice == 1)
				numPuzzle1();
			else if (userChoice == 2)
				numPuzzle2();
			
		}	while (userChoice != 3);
			
		
	}
	
	
	public static void numPuzzle1()
	{
		for (int tens = 1; tens <= 5; tens++ )
    	   {
				for (int ones = 0; ones < 10; ones++ )
				{
					if ( (tens + ones) > 10 && ( (tens * 10) + ones) <= 56 ) 
					out.println( tens + "" + ones);
				}
		   }
	}
	
	public static void numPuzzle2()
	{
			for ( int tens = 1; tens < 10; tens++)
			{
				for ( int ones = 0; ones < 10; ones++ )
				{
					if ( ((tens * 10) + ones) - ((ones * 10) + (tens)) == ((tens) + ones) )
						System.out.println( (tens * 10) + ones );
				}
			}
	}
}