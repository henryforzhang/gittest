/**Description:
  *2017/07/22 ZW
  *purpose:
  *test the method that return this
  *
  */

package ReturnThis.java;

public class ReturnThis
{
	public int age = 0;
	
	public ReturnThis grow()
	{
		age++;
		return this;
     
	}
        
	public static void main(String[] args)
	{
		ReturnThis a = new ReturnThis();
		a.grow()
			.grow()
			.grow();
		System.out.println("The age is: "+a.age);

	}

 
}
