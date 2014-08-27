import java.util.Scanner;
import static java.lang.System.*;

public class Keychains2
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int choice, amount = 0;
		double price = 0;
		
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
			{
				out.print("\nYou have " + amount + " keychains. How many to add? ");
				int x = kb.nextInt();
				amount += add_keychains(x);
				out.println("You now have " + amount + " keychains.");
			}
			else if (choice == 2)
			{
				out.print("\nYou have " + amount + " keychains. How many to remove? ");
				int x = kb.nextInt();
				amount -=remove_keychains(x);
				out.println("You now have " + amount + " keychains.");
			}
			else if (choice == 3)
			{
				out.println("You have " + amount + " keychains.");
				out.println("Keychains cost $10 each.");
				price = view_order(amount);
				out.println("Total cost is $" + price + "."); 
			}
		} while ( choice != 4);
		price = view_order(amount);
		checkout(amount, price);
		
	}
		

	
	public static int add_keychains(int x)
	{
		int A = 0; 
		A += x;
		return (A);
		
	}
	
	public static int remove_keychains(int x)
	{
		int A = 0; 
		A += x;
		return (A);
		
	}
	
	public static double view_order(int x)
	{
		int A = 0;
		A = x * 10;
		return (A);	
	}
	
	public static void checkout(int x, double y)
	{
		out.println("\nCheckout");
		Scanner kb = new Scanner(System.in);
		out.print("\nWhat is your name? ");
		String name = kb.next();
		out.println("You have " + x + " keychains.");
		out.println("Keychains cost $10 each.");
		out.println("Total cost is $" + y + ".");
		out.println("Thank you for your order " + name + "!");	
		
	}
}
	