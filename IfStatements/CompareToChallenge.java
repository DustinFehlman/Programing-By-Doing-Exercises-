import static java.lang.System.*;

public class CompareToChallenge
{
	public static void main (String[] args )
	{
	
		
		//Produces a negative
		out.print("Comparing \"apple\" with \"pear\" ");
		int i = "apple".compareTo("pear");
		out.println(i);
		
		//Produces a negative
		out.print("Comparing \"cat\" to \"farm\" ");
		i = "cat".compareTo("pear");
		out.println(i);
		
		//Produces a negative
		out.print("Comparing \"carrer\" to \"job\" ");
		i = "carrer".compareTo("job");
		out.println(i);
		
		//Produces a negative
		out.print("Comparing \"shark\" to \"whale\" ");
		i = "shark".compareTo("whale");
		out.println(i);
		
		//Produces a negative
		out.print("Comparing \"cow\" to \"horse\" ");
		i = "cow".compareTo("horse");
		out.println(i);
		
		out.println();
		
		//Produces a positive
		out.print("Comparing \"fight\" to \"club\" ");
		i = "fight".compareTo("club");
		out.println(i);
		
		//Produces a positive
		out.print("Comparing \"war\" to \"craft\" " );
		i = "war".compareTo("craft");
		out.println(i);
		
		//Produces a positive
		out.print("Comparing \"star\" to \"craft\" ");
		i = "star".compareTo("craft");
		out.println(i);
		
		//Produces a positive 
		out.print("Comparing \"small\" to \"big\" ");
		i = "small".compareTo("big");
		out.println(i);
		
		//Produces a positive
		out.print("Comparing \"kong\" to \"hong\" ");
		i = "kong".compareTo("hong");
		out.println(i);
		
		//Produces a 0
		out.print("Comparing \"house\" to \"house\" ");
		i = "house".compareTo("house");
		out.println(i);
		
		//Produces a 0
		out.print("Comparing \"Party\" to \"party\" ");
		i = "Party".compareToIgnoreCase("party");
		out.println(i);
	}
}
		
		
		
		
		