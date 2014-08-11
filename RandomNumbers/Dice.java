import java.util.Random;
import static java.lang.System.*;
import java.util.Scanner;

public class Dice
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		out.print( "Here comes the dice! Press ENTER to continue!" );
		keyboard.nextLine();
		
		int rollOne = 1 + r.nextInt(6);
		int rollTwo = 1 + r.nextInt(6);
		int total = rollOne + rollTwo ;
		
		out.println();
		
		out.println( "Roll #1 is a " + rollOne );
		out.print( "Press ENTER for your next roll..." );
		keyboard.nextLine();
		
		out.println();
		
		out.println( "Roll #2 is a " + rollTwo );
		out.println( "The total is " + total + "!" );
	}
}
		
		
		