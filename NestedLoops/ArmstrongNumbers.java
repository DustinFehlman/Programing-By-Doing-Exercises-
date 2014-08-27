import static java.lang.System.*;

public class ArmstrongNumbers
{
	public static void main (String [] args)
	{
		for(int hun = 1; hun <= 9 ; hun++)
		{
			for(int ten = 1; ten <= 9 ; ten++)
			{
				for(int one = 1 ; one <= 9 ; one++)
				{
					if( (hun*hun*hun) + (ten*ten*ten) + (one*one*one) == (hun*100) + (ten*10) + one)
						out.println(hun+""+ten+""+one);
				}
			}
		}
	}
}