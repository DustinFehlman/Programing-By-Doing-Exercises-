import java.util.Scanner;
import static java.lang.System.*;

public class TwoMoreQuestions
{
	
	public static void main( String[] args )
	{
		Scanner keyboard =  new Scanner(System.in);
		
		String answerOne, answerTwo;
		
		out.println( "TWO MORE QUESTIONS, BABY!" );
		
		out.println( "\nThink of something and I'll try to guess it!" );
		
		out.print( "\nQuestion 1) Does it stay inside or outside or both? " );
		answerOne = keyboard.next();
		
		out.print( "Question 2) Is it a living thing? " );
		answerTwo = keyboard.next();
		
		out.println();
		
		if( answerOne.equals("inside") && answerTwo.equals("yes") )
			out.println( "You are a houseplant." );
			
		if( answerOne.equals("inside") && answerTwo.equals("no") )
			out.println( "You are a shower curtain." );
		
		if( answerOne.equals("outside") && answerTwo.equals("yes") )
			out.println( "You are a bison." );
			
		if( answerOne.equals("outside") && answerTwo.equals("no") )
			out.println( "You are a billboard." );
			
		if( answerOne.equals("both") && answerTwo.equals("yes") )
			out.println( "You are a dog." );
			
		if( answerOne.equals("both") && answerTwo.equals("no") )
			out.println( "You are a cell phone." );
	}
}