/**Description:
  *2017/07/25 ZW
  *purpose:
  *Test finalize
  */

package Class.Testfinalize;

public class TestFinalize
{
	private static TestFinalize tf = null;
	public void info()
	{
		System.out.println("test the finalize method ");
	}
	public static void main(String[] args) throws Exception
	{
		new TestFinalize();
		System.gc();
//		Thread.sleep(2000);
		tf.info();

	}

	public void finalize()
	{
		tf = this;
	}
}
