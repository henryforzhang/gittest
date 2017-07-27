//Exception 1 : throw a exception in a programm
public class Exception1
{
	public static void main(String args[])
	{
		int a = 4;
		int b = 0;

		try
		{
			if (b==0)
				throw new ArithmeticException("sb");
			else
				System.out.println("a/b="+a/b);
		}
		catch(ArithmeticException e )
		{
			System.out.println(e);
		}

	}
}




