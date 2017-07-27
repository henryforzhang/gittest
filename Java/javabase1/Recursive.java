/**Description:
  *2017/07/22 ZW 
  *purpose:
  *practice the recursive method
  */

package Recursive.java;


public class Recursive
{
	private static int calcul(int n)
        {
		if (n == 1)
			return 1;
		else
			return calcul(n-1) + n;
	}

	public static void main(String[] args)
	{
		System.out.println(calcul(4));
	}


}


