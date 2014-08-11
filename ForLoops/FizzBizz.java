public class FizzBizz
{
	public static void main( String[] args)
	{
		int x = 1;
		
		for ( ; x <= 100 ; x++ ){
			
			if ( x % 3 == 0 && x % 5 == 0)
				System.out.println("FizzBuzz");
			else if ( x % 3 == 0 )
				System.out.println("Fizz");
			else 
				System.out.println(x);
				
		}
	}
}