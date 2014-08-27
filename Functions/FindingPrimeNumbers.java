import static java.lang.System.*;

public class FindingPrimeNumbers
{
	public static void main( String[] args )
	{
		for(int n = 2; n <= 20 ; n++ )
		{
			if( isPrime(n) == true)
				out.println(n + "<");
			else
				out.println(n);
		}
	}
				
		
	public static boolean isPrime( int n )
	{
		boolean prime = true;
		for( int x = 2; x < n; x++ )
		{
			if (n % x == 0)
			{
				prime = false;
			}
		}
			return prime;	
			
	}
}
			