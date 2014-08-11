import java.util.Scanner;

public class EnterPin
{
	public static void main( String[] args )
	{
	
		Scanner keyboard =  new Scanner (System.in);
		int pin, entry;
	
		pin = 12345;
	
		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
	
	//While loops are like if statements, as it checks if a condition is true, but different as it
	//continues to run the code until it is fasle.
	
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt ();
			//No need to use a Int for the variable because the variable is declared in the bigger scope.
		}
	
	System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}
	