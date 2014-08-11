public class NoticingEvenNumbers
{
	public static void main( String[] args )
	{
		int x = 1;
		
		for( ; x <=20 ; x++){
		
			if (x %2 == 0)
				System.out.println(x + "<");
			else
				System.out.println(x);
				
		}
	}
}