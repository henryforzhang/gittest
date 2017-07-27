/**Description:
  *2017/07/22 ZW
  *purpose:
  *test the reload of the method in the same class
  */

package MethodReload.java;

public class MethodReload
{
	public static void test()
	{
		System.out.println("No para");
	}
	
	public static int test(int a, int b)
	{
		System.out.println("Para");
		return a+b;
	}

	public static void main(String[] args)
	{
		test();
		test(1, 2);


	}

}
