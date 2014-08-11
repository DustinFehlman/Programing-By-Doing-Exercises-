public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15;
		
		//If checks to see if one variable is great than the other; if true, it prints the string.
		//The curly braces mark where the if statement  starts and stop. 
		if ( people < cats )
		{
			System.out.println( "Too many cats! The world is doomed!" );
			
		}
		//
		if ( people > cats )
		{
			System.out.println( "Not many cats! The world is saved!" );
		}
		
		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}
		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}
		
		dogs += 5;
		
		if ( people >= dogs )
		{
			System.out.println ( "People are greater than or equal to dogs." );
		}
		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}
		if( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}
			