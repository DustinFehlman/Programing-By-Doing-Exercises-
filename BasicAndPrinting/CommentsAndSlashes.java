//Dustin Fehlman 07-25-14
//I was mistaken, I thought that // would actually ignore a function of another syntax key.
public class CommentsAndSlashes
{
	public static void main( String [] args )
	{
		// A comment, this is so you can read your program later.
		// Anything after the // is ignored by Java.
		
		System.out.println( "I could have code like this." ); // and the comment after is ignored.
		
		// You can also use a comment to "Disable" or comment out a piece of code:
		// System.out.println("This won't run.");
		
		System.out.println( "This will run." );
	}
}