import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Type in a message, and I'll display it several times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.print( "How many times? " );
		int printAmount = keyboard.nextInt();
		
		int n = 10, a = 1;
		while ( a <= printAmount )
		{
			System.out.println( n + ". " + message );
			a++;
			n = n + 10;
		}
	}
}