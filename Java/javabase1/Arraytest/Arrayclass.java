/** Description:
  *2017/07/22 ZW
  *purpose:
  *try the array class 
  */
import java.util.*;

public class Arrayclass
{
	public static void main(String[] args)
	{
		int[] a1 = new int[]{3, 4, 5, 6};
		int[] a2 = new int[]{3, 4, 5, 6};

		System.out.println("a1 == a2 ? :"+ Arrays.equals(a1, a2));
		
		int[] b1 = Arrays.copyOf(a1, 6);
                System.out.println("a1 == b1 ? :"+ Arrays.equals(a1, b1));
 
		System.out.println("b1 ? : "+Arrays.toString(b1));

		Arrays.fill(b1, 2, 4, 1);

	        System.out.println("b1 after change: "+Arrays.toString(b1));
                
		Arrays.sort(b1);
		System.out.println("b1 after sort: "+Arrays.toString(b1));

	}

}
