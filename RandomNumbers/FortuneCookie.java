import static java.lang.System.*;
import java.util.Random;

public class FortuneCookie
{
	public static void main( String[] args )
	{
		Random r = new Random();
		
		int fortune = 1 + r.nextInt(6);
		int first = 1 + r.nextInt(54);
		int second = 1 + r.nextInt(54);
		int third = 1 + r.nextInt(54);
		int fourth = 1 + r.nextInt(54);
		int fifth = 1 + r.nextInt(54);
		int sixth = 1 + r.nextInt(54);
		
		String luckyNumbers = "Lucky Numbers: " + first + " - " + second + " - " + third + " - " + fourth + " - " + fifth + " - " + sixth ;
		
		if ( fortune == 1 )
			out.println( "You have no future! \n\t" + luckyNumbers );
		else if ( fortune == 2 )
			out.println( "Have fun! \n\t" + luckyNumbers );
		else if ( fortune == 3 )
			out.println( "Stick with your wife \n\t" + luckyNumbers );
		else if ( fortune == 4)
			out.println( "Go with the flow \n\t" + luckyNumbers );
		else if ( fortune == 5)
			out.println( "Good things are ahead \n\t" + luckyNumbers );
		else if ( fortune == 6 )
			out.println( "Many people like you! \n\t" + luckyNumbers );
		else
			out.println( "You cant get fortune cookies, unless you go to a Chinese restaurant!" );
	}
}
		
		