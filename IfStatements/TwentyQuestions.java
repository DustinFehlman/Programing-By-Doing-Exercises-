import java.util.Scanner;
import static java.lang.System.*;

public class TwentyQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer;
		
		out.println( "TWO QUESTIONS!" );
		out.println( "Think of an object, and I'll try to guess it." );
		
		out.println( "\nQuestions 1) Is is an animal, vegetable, or mineral?" );
		out.print( "> " );
		String questionOne;
		questionOne = keyboard.next();
		
		out.println( "\nQuestion 2) Is it bigger than a breadbox?" );
		out.print( "> " );
		String questionTwo;
		questionTwo = keyboard.next();
		
		if ( questionOne.equals("animal") )
		{
			if ( questionTwo.equals("yes") )
			{
				answer = "moose";
			}
			else
			{
				answer = "squirrel";
			}
		}
		else if ( questionOne.equals("vegetable") )
		{	
			if ( questionTwo.equals("yes") )
			{
				answer = "watermelon" ;
			}
			else
			{
				answer = "carrot" ;
			}
		}
		else
		{	
			if ( questionTwo.equals("yes") )
			{
				answer = "Camaro" ;
			}
			else
		
				answer = "paper clip";
		}
		
		out.println( "\nMy guess is that you are thinking of a " + answer + "." );
		out.println( "I would ask you if I'm right, but I dont actually care." );
		
	}
}
				
	