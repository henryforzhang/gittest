/**Description:
  *2017/07/23 ZW
  *purpose:
  *test Polymorphism
  */

package Class.SubClass;

class BaseClass
{
	public int book = 6;
	
	public void base()
	{
		System.out.println("Ordinary Method in father");
	}

	public void test()
	{
		System.out.println("The overrided Method of father");
	}
}

public class SubClass extends BaseClass
{
	public String book = "You silly fool";

	public void test()
	{
		System.out.println("The Method override the father");

	}

	public void sub()
	{
		System.out.println("Ordinary Method in son");
	}

	public static void main(String[] args)
	{
		BaseClass bc = new BaseClass();

		System.out.println(bc.book);

		bc.base();
		bc.test();

		SubClass sc = new SubClass();

		System.out.println(sc.book);

		sc.base();
		sc.test();

		BaseClass ploy = new SubClass();
		SubClass ploymophicBc = (SubClass)ploy;

		System.out.println(ploymophicBc.book);

		ploymophicBc.base();
		ploymophicBc.test();

		ploymophicBc.sub();
	}


}

