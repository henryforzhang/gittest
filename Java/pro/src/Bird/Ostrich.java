/**Description:
  *2017/07/23 ZW
  *purpose:
  *Ostrich
  */

package Class.Bird;

public class Ostrich extends Bird
{
	public void fly()
	{
		System.out.println("I cannot fly");
	}
	public static void main(String[] args)
	{
		Ostrich os = new Ostrich();
		os.fly();

	}

}
