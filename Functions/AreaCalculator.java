import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class AreaCalculator
{
	public static void main( String[] args )	
	{
		
		Scanner kb =  new Scanner(System.in);
		int userChoice;
		
		out.println("Shape Area Calculator");
		
		do
		{
		
			out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			out.println();
		
			out.println("1. Triangle");
			out.println("2. Rectangle");
			out.println("3. Square");
			out.println("4. Circle");
			out.println("5. Quit");
			out.print("Which shape: ");
			userChoice  = kb.nextInt();
			out.println();
		
			if ( userChoice == 1 )
			{
				out.print("Base: ");
				int b = kb.nextInt();
				out.print("Height: ");
				int h = kb.nextInt();
				out.println("\nThe area is " + areaTriangle(b, h) +".");
			}
			else if ( userChoice == 2 )
			{
				out.print("Base: ");
				int b = kb.nextInt();
				out.print("Height: ");
				int h = kb.nextInt();
				out.println("\nThe area is " + areaRectangle(b, h) +".");
			}
			else if ( userChoice == 3)
			{
				out.print("Side length: ");
				int b = kb.nextInt();
				out.println("\nThe area is " + areaSquare(b)+".");
			}
			else if( userChoice == 4)
			{
				out.print("Radius ");
				int b = kb.nextInt();
				out.println("\nThe area is " + areaCircle(b) + ".");
			}
		} while ( userChoice != 5);
	}
	public static int areaSquare( int side )
	{
		int A = side * side;
		return A;
	}
	
	public static int areaRectangle ( int length, int width)
	{
		int A = length * width;
		return A;
	}
	
	public static double areaTriangle( int base, int height)
	{
		double A;
		A = (base * height) / 2;
		return A;
	}
	
	
	public static double areaCircle ( int radius )
	{
		double A;
		A = Math.PI * (radius * radius);
		return A;
	
	}
}
	
	