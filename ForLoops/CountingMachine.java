import java.util.Scanner;

public class CountingMachine

{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Count to: ");
		int userInput = keyboard.nextInt(), counting = 0;
		
		for( ; counting <= userInput ; counting++){
			
			System.out.print(counting + " ");
		} 
	}
}