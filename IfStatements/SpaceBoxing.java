import java.util.Scanner;
import static java.lang.System.*;

public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Double weight, newWeight, venus = 0.78, mars = 0.39 , jupiter = 2.65, saturn = 1.17, 
		uranus = 1.05, neptune = 1.23;
		int choice;
		
		out.print( "Please enter your current Earth weight: " );
		weight = keyboard.nextDouble();
		
		out.println();
		
		out.println( "I have the information for the following planets:\n\t1. Venus\t2. Mars \t3. Jupiter \n\t4. Saturn\t5. Uranus\t6. Neptune" );
		
		out.print( "\nWhat planet are you visiting? " );
		choice = keyboard.nextInt();
		
		out.println();
		
		if ( choice == 1 )
		{
			newWeight = weight * venus;
			out.println( "Your weight would be " + newWeight + " on that planet." );
		}
		else if ( choice == 2 )
		{
			newWeight = weight * mars;
			out.println( "Your weight would be " + newWeight + " on that planet." );
		}
		else if ( choice == 3 )
		{
			newWeight = weight * jupiter;
			out.println( "Your weight would be " + newWeight + " on that planet." );
		}
		else if ( choice == 4 )
		{
			newWeight = weight * saturn;
			out.println( "Your weight would be " + newWeight + " on that planet." );
		}
		else if ( choice == 5 )
		{
			newWeight = weight * uranus;
			out.println( "Your weight would be " +newWeight + " on that planet." );
		}
		else if ( choice == 6 )
		{
			newWeight = weight * neptune;
			out.println( "Your weight would be " + newWeight + "on that planet." );
		}
		else
			out.println( "Not a valid planet selection!" );
	}
}