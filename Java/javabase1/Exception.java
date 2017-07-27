//test the exception (try catch finally)

public class Exception
{
	public static void main(String args[])
	{
		try
		{
			int arr[] = new int[5];
			arr[10] = 1;
	        }
		catch(ArrayIndexOutOfBoundsException e)
		{
                        System.out.println("ERROR!");
		}
		finally
		{
                        System.out.println("Must be executed");	
		}

                        System.out.println("main() end");	

	}


}
