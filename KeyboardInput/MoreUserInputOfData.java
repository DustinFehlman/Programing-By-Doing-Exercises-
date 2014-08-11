import java.util.Scanner;

public class MoreUserInputOfData
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String firstName, lastName, login;
		int grade, studentId;
		double gpa;
		
		System.out.println("Please enter the following information so I can sell it for profit!" );
		
		System.out.print( "\nFirst name: " );
		firstName = keyboard.next();
		
		System.out.print( "Last name: " );
		lastName = keyboard.next();
		
		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();
		
		System.out.print( "Student ID: " );
		studentId = keyboard.nextInt();
		
		System.out.print( "Login: " );
		login = keyboard.next();
		
		System.out.print( "GPA (0.0-4.0): " );
		gpa = keyboard.nextDouble();
		
		System.out.println( "\nYour information:" );
		System.out.println( "\tLogin: " + login );
		System.out.println( "\tID: " + studentId );
		System.out.println( "\tName: " + lastName + ", " + firstName );
		System.out.println( "\tGPA: " + gpa );
		System.out.println( "\tGrade: " +grade );
	}
} 