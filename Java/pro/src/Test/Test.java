/**Description:
  *2017/07/23 ZW
  *purpose:
  *static block
  *
  */

package Class.staticblock;

class Root
{
	static 
	{
		System.out.println("Root static initalization part");
	}

	{
		System.out.println("Root commom intialization part");
	}

	public Root()
	{
		System.out.println("Root No para contruction");
	}

}

class Mid extends Root
{
	static 
	{
		System.out.println("Mid static block");
	}

	{
		System.out.println("Mid block");
	}
	
	public Mid()
	{
		System.out.println("Mid No para construction");
	}

	
	public Mid(String msg)
	{
		this();
		System.out.println("Mid para construction "+msg);
	}


}

class Leaf extends Mid
{
	static
	{
		System.out.println("Leaf static block");
	}

	{
		System.out.println("Leaf common block");
	}

	public Leaf()
	{
		super("Authority");
		System.out.println("Execute Leaf construction");
	}
}
public class Test
{
	
	public static void main(String[] args)
	{
		new Leaf();
		new Leaf();
	}
}
