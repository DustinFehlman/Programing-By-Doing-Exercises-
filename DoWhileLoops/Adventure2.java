import java.util.Scanner;
import static java.lang.System.*;

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 0, roomChoice = 1;
		String choice = "";
		
		out.println("The scary tiny adventure 2!");
		out.println();
		
		do
		{
			if( roomChoice == 1);
			{
				out.println("You are in a creepy house! You see a garage, and a kitchen. ");
				out.println("Where would you like to go?");
				out.print("> ");
				choice = keyboard.nextLine();
			}
			if( choice.equalsIgnoreCase("garage") )
			{
				roomChoice = 2;
				out.println("\nGoing through the garage, you see a path to the frontyard, or the backyard." );
				out.println("Which do you choose? Or do you go back?");
				out.print("> ");
				choice = keyboard.nextLine();
				
				if( choice.equalsIgnoreCase("frontyard") )
				{
					out.println("\nYou go outside to the front yard, and there is a horde of Zombies." );
					roomChoice = 0;
				}
				else if (choice.equalsIgnoreCase("backyard") )
				{
					out.println("You go in the backyard and see your old dog Rex.");
					out.println("He looks at you with his eyes, but there is something different, really different.");
					out.println("You feel rex jump at you, and as your head hits a rock, you feel your throat ");
					out.println("tugging at you, as Rex runs with it in his mouth.");
					roomChoice = 0;
				}
				else if (choice.equalsIgnoreCase("back") )
				{
					roomChoice = 1;
				}
				else
				{
					out.println("Not a valid entry.");
				}
			}
			if( choice.equalsIgnoreCase("kitchen") )
			{
				roomChoice = 3;
				out.println("\nIn the kitchen, you see a pantry, and the fridge.");
				out.println("Which do you open? The pantry, the fridge, or do you go back?");
				out.print("> ");
				choice = keyboard.nextLine();
					
					if( choice.equalsIgnoreCase("pantry") )
					{
						out.println("\nA giant spider bursts out of the pantry and eats you.");
						roomChoice = 0;
					}
					else if( choice.equalsIgnoreCase("fridge") )
					{
						out.println("\nYou open the fridge, and you see some food. you eat it...");
						roomChoice = 0;
					}
					else if (choice.equalsIgnoreCase("back") )
					{
						roomChoice = 1;
					}
					else
					{
						out.println("Not a valid entry.");
					}
			}
			
			
		} while ( roomChoice != 0 );
					
		out.println("\n .....You are dead.....");
	}
}
			
			
				
		
		
		