import java.util.Scanner;
import static java.lang.System.*;

public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String quizPrep;
		int answerOne, answerTwo, answerThree, correctAnswers = 0;
		
		out.print( "Are you ready for a quiz? Yes/No " );
		quizPrep = keyboard.next();
		
		if ( ! quizPrep.equals("Yes"))
			out.println( "Please come back when you are ready!" );
		else
		{
			out.print( " Let's get started!" );
			
			out.println( "\nQ1) What is 1 + 1 ?" );
			out.println( "\t\t1) 200" );
			out.println( "\t\t2) 300" );
			out.println( "\t\t3) 2" );
			out.print( "\n> " );
			answerOne = keyboard.nextInt();
		
			if ( answerOne == 3 )
				out.println( "\nThat's right!" );
			else
				out.println( "\nSorry! 1 + 1 = 2" );
			
			out.println( "\nQ2) How many days are there in a year?" );
			out.println( "\t\t1) 5" );
			out.println( "\t\t2) 365" );
			out.println( "\t\t3) 40" );
			out.print( "\n> " );
			answerTwo = keyboard.nextInt();
		
			if ( answerTwo == 2 )
				out.println( "\nThat's correct!" );
			else
				out.println( "\nSorry! There are 365 days in a year." );
			
			out.println( "\nQ3) How many hours are there in a day?" );
			out.println( "\t\t1) 24" );
			out.println( "\t\t2) 9" );
			out.println( "\t\t3) 12" );
			out.print( "\n> " );
			answerThree = keyboard.nextInt();
		
			if ( answerThree == 1 )
				out.println( "\n Great job!" );
			
			else 
				out.println( "\nSorry! There are 24 hours in a day." );
		
			if ( answerOne == 3)
				++correctAnswers;
			if ( answerTwo == 2)
				++correctAnswers;
			if ( answerThree == 1)
				++correctAnswers;
			
			out.println( "\n\nOverall, you got " + correctAnswers + " out of 3 correct. ");
			out.println( "Thanks for playing!");
		}
	}
}
		