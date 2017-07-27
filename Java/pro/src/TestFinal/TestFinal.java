/**Description:
  *2017/07/24 ZW
  *purpose:
  *Test the Varible ornamented by final
  */

package Class.TestFinal;

public class TestFinal
{
	//final int age won't pass the compilation
        int age;
	{
	//	System.out.println(age);
	//        age = 6;
	//	System.out.println(age);
	}

	public static void main(String[] args)
	{	
		TestFinal a = new TestFinal();
                System.out.println(a.age);
	}

}
