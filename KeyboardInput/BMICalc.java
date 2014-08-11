import java.util.Scanner;

public class BMICalculator
{
	public static void main( String [] args )
	{
		Scanner keyboard = new Scanner (System.in);
		double m, kg, bmi, inches, pounds, feet;
		
		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds " );
		pounds = keyboard.nextDouble();
		
		kg = pounds * 0.453592;
		m = ((feet * 12) + inches) * 0.0254;
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}