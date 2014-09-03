import java.util.Random;

public class CopyingArrays
{
	public static void main ( String[] args )
	{
		int [] Arraylist1 = new int [10];
		int [] Arraylist2 = new int [10];
		Random r = new Random ();
		
		//Loops to store random values into array slots
		for ( int x = 0; x < Arraylist1.length; x++)
		{
			Arraylist1[x] = 1 + r.nextInt(99);
			Arraylist2[x] = Arraylist1[x];
		}
		
		Arraylist1[9] = -7;
		
		System.out.print("Arraylist1: ");
		for ( int a1 : Arraylist1 )
		{
			System.out.print(a1 + ", ");
		}
		
		System.out.println();
		System.out.print("Arraylist2: ");
		
		for (int a2 : Arraylist2 )
		{
			System.out.print(a2 + ", ");
		}
		System.out.println();
	}
}
		
		
		  
		
