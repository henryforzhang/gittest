/**Description:
  *2017/07/22 ZW
  *purpose:
  *Test the flexible number of para
  *
  *
  */


public class Varargs
{
	public static void test(int a, String... books)
	{
		//What is the usage of tmp or for()?
		for(String tmp : books)
		{
			System.out.println(tmp);
		}
	}

	public static void main(String[] args)
	{
		test(5, "You silly fool", "Crazy");

	}

}
