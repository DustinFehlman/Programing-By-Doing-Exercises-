import java.util.Scanner;
import static java.lang.System.*;

public class Keychains1
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int choice;
		
		out.println("Welcome to the Keychain Shop");
		
		
		do
		{
			out.println();
			out.println("1. Add Keychains to Order");
			out.println("2. Remove Keychains from Order");
			out.println("3. View Current Order");
			out.println("4. Checkout");
			out.println();
			out.print("Please enter your choice: ");
			choice = kb.nextInt();
			
			if ( choice == 1)
				add_keychains();
			else if (choice == 2)
				remove_keychains();
			else if (choice == 3)
				view_order();
		} while ( choice != 4);
		
		checkout();
	}
		

	
	public static void add_keychains()
	{
		out.println("\nAdd Keychains");
	}
	
	public static void remove_keychains()
	{
		out.println("\nRemove Keychains");
	}
	
	public static void view_order()
	{
		out.println("\nView Order");
	}
	
	public static void checkout()
	{
		out.println("\nCheckout");
	}
}
	