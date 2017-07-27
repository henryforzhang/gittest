/**Description:
  *2017/07/23 ZW
  *purpose:
  *test composite
  *
  */

package Class.TestComposite;


class Animal
{
	private void beat()
	{
		System.out.println("Beating");
	}

	public void breath()
	{
		beat();
		System.out.println("breathe and exhale");
	}

}

class Bird
{
	private Animal a;

	public Bird(Animal a)
	{
		this.a = a;
	}

	public void breath()
	{
		a.breath();
	}
	
	public void fly()
	{
		System.out.println("Fly in the sky");
	}
}
class Wolf
{
	private Animal a;
	
	public Wolf(Animal a)
	{
		this.a = a;
	}

	public void breath()
	{
		a.breath();
	}

	public void run()
	{
		System.out.println("Run on the Ground");
	}

}

public class Testcomposite
{
	public static void main(String[] args)
	{
		Animal a1 = new Animal();
		
		Bird b = new Bird(a1);
		b.breath();
		b.fly();

		Animal a2 = new Animal();
		
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();

	}
}
