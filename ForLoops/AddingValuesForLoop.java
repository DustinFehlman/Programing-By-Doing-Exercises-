import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Number: ");
		int userNumber = kb.nextInt();
		int addedValue = 0;
		
		System.out.println();
		
		for( int i = 1; i <= userNumber ; i++ ){
		
			System.out.print(i + " ");
			
			addedValue = addedValue + i;
		}
		
		System.out.println( "\nThe sum is " + addedValue + ".");
	}
}
		