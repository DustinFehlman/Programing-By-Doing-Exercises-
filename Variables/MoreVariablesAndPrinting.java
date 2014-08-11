public class MoreVariablesAndPrinting
{
	public static void main( String[] args )
	{
		String hisName, hisEyes, hisTeeth, hisHair;
		int hisAge, hisHeight, hisWeight;
		double hisMetricHeight, hisMetricWeight;
		
		hisName = "Zed A. Shaw";
		hisAge = 35;  // not a lie
		hisHeight = 74; // inches
		hisWeight = 180; // lbs
		hisEyes = "Blue";
		hisTeeth = "White";
		hisHair = "Brown";
		hisMetricHeight = 2.54 * hisHeight;
		hisMetricWeight = 0.453592 * hisWeight;
		
		System.out.println( "Let's talk about " + hisName + "." );
		System.out.println( "He's " + hisHeight + " (or " + hisMetricHeight + " cm) inches tall." );
		System.out.println( "He's " + hisWeight + " (or " + hisMetricWeight + " kg) pounds heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + hisEyes + " eyes and " + hisHair + " hair." );
		System.out.println( "His teeth are usually " + hisTeeth + " depending on the coffee." );
		
		System.out.println( "If I add " + hisAge + ", " + hisHeight + ", and " + hisWeight 
		+ " I get " + (hisAge + hisHeight + hisWeight) + ".");
	}
}
		