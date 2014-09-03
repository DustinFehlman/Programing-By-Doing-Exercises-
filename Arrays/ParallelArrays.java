import java.util.Scanner;

public class ParallelArrays
{
	public static void main( String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String[] names = { "Johnson", "Brooks", "Lopez", "Richards", "Vargas" };
		double[] gpa = { 99.5, 78.5, 95.6, 96.8, 82.5};
		int[] studentId = { 12345, 54321, 67890, 59876, 56478 };
		int idCheck = 0;
		int slot = 0;
		
		System.out.println("Values:");
		for( int x = 0; x < studentId.length ; x++)
		{
			System.out.println("\t" + names[x] + " " + gpa[x] + " " + studentId[x] );
		}
		
		System.out.println();
		System.out.print("ID number to find: ");
		int userChoice = kb.nextInt();
		
		for( int id : studentId )
		{
			
			if( id == userChoice )
			{
				slot = idCheck;
			}
			
			idCheck++;
		}		
		
		System.out.println();
		System.out.println("Found in slot " + slot);
		System.out.println("\tName: " + names[slot]);
		System.out.println("\tAverage: " + gpa[slot]);
		System.out.println("\tID: " + studentId[slot]);
		
	}
}
		
		
		