import java.util.Scanner;
import static java.lang.System.*;

public class Adventure1
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.println( "WELCOME TO DUSTIN'S TINY ADVENTURE!" );
		
		out.println( "\nYou are in a creepy house! Would you like to go \"upstairs\" or" ); 
		out.println( "into the \"kitchen\"?" );
		out.print( "> " );
		String answerOne = keyboard.next();
		
		if ( answerOne.equals ("kitchen") )
		{
			out.println( "\nYou look around see and see a fridge and a cabinet." ); 
			out.println(	"Which do you open?" );
			out.print( "> ");
			String answerTwo = keyboard.next();
			
			if ( answerTwo.equals("fridge") )
			{
				out.println( "\nYou see a knife and a lunch box full of packed food." );
				out.println( "Which do you take?" );
				out.print( "> ");
				String answerThree = keyboard.next();
				
				if ( answerThree.equals("knife") )
				{
					out.println("\nLet's see if you can hunt for your food." );
				}
				else
				{
					out.println("\nI hope you will be able to defend your food." );
				}
			}
			else
			{
				out.println ( "\nYou see a bottle of vodka and matches." );
				out.println ( "\nWhich do you take?" );
				out.print( "> ");
				String answerThree = keyboard.next();
				
				if ( answerThree.equals("vodka") )
				{
					out.println("\nLuckily you can now drink yourself out of this nightmare." );
				}
				else
				{
					out.println("\nGood choice, no one can hear you scream in the dark!" );
				}
			}
		}
		else
		{
			out.println( "\nYou see a two rooms. A bathroom and a bedroom. Which one do you enter?" );
			out.print( "> ");
			String answerTwo = keyboard.next();
			
			if ( answerTwo.equals("bathroom") )
			{
				out.println("\nYou see first-aid kit, and a gas mask." );
				out.println("Which do you take?" );
				out.print( "> ");
				String answerThree = keyboard.next();
				
				if ( answerThree.equals("first-aid kit") )
				{
					out.println("\nThe survivors never get hurt!" );
				}
				else
				{
					out.println("\nGood choice, the smell is horrible!" );
				}
			}
			else
			{
				out.println( "\nYou see a blanket and a crowbar." );
				out.println( "Which do you take?" );
				out.print( "> ");
				String answerThree = keyboard.next();
				
				if ( answerThree.equals("blanket") )
				{
					out.println("\nThere is not warmth in death!" );
				}
				else
				{
					out.println("\nAgression will help your survive, or be your downfall." );
				}
			}
		}
	}
}
				
				
					