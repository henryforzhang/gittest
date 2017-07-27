// test the Exception: Exception occurs in the method


class test
{
	
	
	public String Test(int a, int b)
	{
		return "Result is "+a/b;

	}


}
public class Exception2
{
	public static void main(String[] args)
	{
		int a = 4;
		int b = 0;

		try
		{
			test s = new test();
                        System.out.println(s.Test(a,b));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
