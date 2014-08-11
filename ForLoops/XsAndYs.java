public class XsAndYs
{
	public static void main( String[] args )
	{
		System.out.println("x \t y");
		System.out.println("------");
		double startingNumber = -10 , squared;
		
		for( ; startingNumber <= 10 ; startingNumber = startingNumber + 0.5){
			
			squared = startingNumber * startingNumber;
			System.out.println(startingNumber + " \t " + squared);
			
		}
	}
}
		
		