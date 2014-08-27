import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on " + weekday(mm, dd, yyyy) + "!");
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";
			
		yy = yyyy - 1900;
		total = ((yy / 4) + dd);
		total += month_offset(mm);
		if ( mm == 1 || mm == 2 && is_leap(yyyy))
			total -= 1;

		date = weekday_name(total % 7) + "," + month_offset(mm) + " " + dd + " , " + yyyy;

		return date;
	}


	public static int month_offset( int mm )
	{
	
	int offSet = 0;
	
	if ( mm == 1)
		offSet = 1;
	else if ( mm == 2)
		offSet = 4;
	else if (mm == 3)
		offSet = 4;
	else if (mm == 4)
		offSet = 0;
	else if (mm == 5)
		offSet = 2;
	else if (mm  == 6)
		offSet = 5;
	else if (mm == 7)
		offSet = 0;
	else if (mm == 8)
		offSet = 3;
	else if (mm == 9)
		offSet = 6;
	else if (mm == 10)
		offSet = 1;
	else if (mm == 11)
		offSet = 4;
	else if (mm == 12)
		offSet = 6;

	return offSet;
	
	}
	
	public static String weekday_name( int weekday )
	{
		String result = "";
		
		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if ( weekday == 7 )
		{
			result = "Saturday";
		}
		else if ( weekday == 0 )
		{
			result = "Saturday";
		}
		else
		{
			result = "error";
		}
		return result;
	}
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		
		
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}