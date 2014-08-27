import static java.lang.System.*;

public class EvennessFunction
{
	public static void main( String[] args )
	{
		for(int n = 1; n <= 20 ; n++ )
		{
			if( isDisvisibleBy3(n) && isEven(n) )
				out.println(n + "<=" );
			else if( isEven(n) )
				out.println(n + "<");
			else if( isDisvisibleBy3(n) )
				out.println(n + "=");
			else
				out.println(n);
		}
	}
				
		
	public static boolean isEven( int n )
	{
		if ( n % 2 == 0 )
			return true;
		else
			return false;
	}
	
	public static boolean isDisvisibleBy3( int n )
	{
		if ( n % 3 == 0 )
			return true;
		else 
			return false;
	}
}
			