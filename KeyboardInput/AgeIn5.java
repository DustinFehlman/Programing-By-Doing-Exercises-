import java.util.Scanner;

public class AgeIn5
{
	public static void main( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, plus5, minus5;
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "\nHi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		plus5 = age + 5;
		minus5 = age - 5;
		
		System.out.println( "\nDid you know that in five years you will be " + plus5 + " years old?" );
		System.out.println( "And five years ago you were " + minus5 + "! Imagine that!" );
	}
}

