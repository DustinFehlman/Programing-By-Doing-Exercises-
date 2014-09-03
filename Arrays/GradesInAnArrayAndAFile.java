import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class GradesInAnArrayAndAFile
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout;
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		int y = 1;
		
		System.out.print( "Name (first and last):");
		String name = kb.nextLine();
		System.out.print( "Filename: ");
		String filename = kb.next();
		System.out.println();
		fileout = new PrintWriter( new FileWriter(filename) );
		fileout.println(name);
		
		int[] grades = new int [5];
		
		for( int x = 0; x < grades.length; x++)
		{
			grades [x] = 1 + r.nextInt(99);
			System.out.println("Grade " + y + ": " + grades[x]);
			fileout.print( grades [x] + ", " );
			
			
			y++;
		}
		
		fileout.close();
		
		System.out.println("\nData saved in \"" + filename + "\".");
	}
}