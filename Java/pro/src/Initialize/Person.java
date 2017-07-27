/**Descrption:
  *2017/07/23 ZW
  *purpose:
  *test static block
  *
  */

package Class.block;

public class Person
{
	{
		int a = 6;
		if (a > 4)
		{
			System.out.println("Lnitialize Block: a>4");
		}
		System.out.println("Person's initialzation block");
	}

	{
		System.out.println("The Second one");
	}

	public Person()
	{
		System.out.println("Person No para Construction");
	}
	
	public static void main(String[] args)
	{
		new Person();
	}

}
