/**Description:
  *2017/07/22 ZW
  *purpose:
  *test the variable effective range
  */

package TestVarRange.java;
public class TestVarRange
{
	public int foo = 2;
	
	public TestVarRange()
	{
		int foo = 0;
//		this.foo = 1;
		System.out.println("inside the method: "+foo);
                System.out.println("Outside the method: "+this.foo);

	}

	public static void main(String[] args)
	{
		System.out.println(new TestVarRange().foo);


	}


}
