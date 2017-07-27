/**description:
  *2017/07/24 ZW
  *purpose:
  *the format of the inner class when it is established outside the outter class
  *
  */

package Class.InnerClass;

class Out
{
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
}

public class InnerClass
{
	public static void main(String[] args)
	{
		Out.In in = new Out().new In("Test Message");
		//Out.In in;
		//Out out = new Out();
		//in = out.new In("Test Message");
		new Subclass(new Out());

	}
	
}

class Subclass extends Out.In
{
	public Subclass(Out out)
	{
		//ensure the son class can access the father class's construction
		out.super("Hello");

	}
}
