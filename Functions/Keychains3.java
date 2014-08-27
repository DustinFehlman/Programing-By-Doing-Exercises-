import java.util.Scanner;
import static java.lang.System.*;

public class Keychains3
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int choice, amount = 0;
		double keychainPrice = 10, totalPrice = 0, tax = 0.0825, shipping = 5.00, addtionalShipping = 1.00;
		
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
				if ( x > amount )
					out.println("ERROR, you can not remove that many keychains!");
				else
				{
					amount -=remove_keychains(x);
					out.println("You now have " + amount + " keychains.");
				}
			}
			else if (choice == 3)
			{
				out.println("You have " + amount + " keychains.");
				out.println("Keychains cost " + keychainPrice + " each.");
				out.println("Tax is at a 8.25%");
				out.println("Shipping is $5.00, plus $1.00 for each additional keychain");
				double subTotal = keychainPrice * amount;
				out.println("Subtotal: $" + subTotal );
				out.println("Tax: $" + subTotal * tax );
				totalPrice = view_order(amount, keychainPrice, tax, shipping, addtionalShipping);
				out.println("Total cost with tax and shipping is $" + totalPrice + "."); 
			}
			else if (choice > 4)
				out.println("ERROR, that is not a valid option!");
				
		} while ( choice != 4);
		totalPrice = view_order(amount, keychainPrice, tax, shipping, addtionalShipping);
		checkout(amount, keychainPrice, tax, shipping, addtionalShipping);
		
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
	
	public static double view_order(int numKeychains, double pricePerKeychain, 
	double salesTax, double baseShipping, double perKeyShipping ) 
	{
		double A = 0, B = 0, C = 0, D = 0;
		A = numKeychains * pricePerKeychain;
		if( numKeychains < 1 )
			B = (numKeychains * perKeyShipping) + baseShipping - 1;
		else
			B = baseShipping;
		C =   A * salesTax;
		D = B + A + C;
		return (D);	
	}
	
	public static void checkout(int numKeychains, double pricePerKeychain, 
	double salesTax, double baseShipping, double perKeyShipping ) 
	{
		out.println("\nCheckout");
		Scanner kb = new Scanner(System.in);
		out.print("\nWhat is your name? ");
		String name = kb.next();
		out.println("You have " + numKeychains + " keychains.");
		out.println("Keychains cost $" + pricePerKeychain + " each.");
		double total = view_order(numKeychains, pricePerKeychain, salesTax, baseShipping, perKeyShipping);
		out.println("Your total for this order is $" + total);
		out.println("Thank you for your order " + name + "!");	
		
	}
}
	