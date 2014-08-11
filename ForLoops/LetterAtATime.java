import java.util.Scanner;

public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("What is your message? ");
		String message = kb.nextLine();
		
		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '"+ message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");
		
		//Putting a <= crashs the program at the end.
		//Box length is 3 characters, x is at the second spot.
		//Using <= makes the program crash due to character count is zero based and length is not. 
		for ( int i = 0 ; i < message.length(); i++ )
		{
			System.out.println("\t" + i + " - ' " + message.charAt(i) + "'");
		}
		int vowelCount = 0;
		
		for ( int i = 0; i < message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I'
			|| letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U' )
			{
				vowelCount++;
			}
		}
		System.out.println("\nYour message contains the letter vowels " + vowelCount + " times. Isn't that interesting?");
	}
}