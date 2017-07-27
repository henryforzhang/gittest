/**Description:
  *2017/07/24
  *purpose:
  *interface 
  *
  */

package Class.printer;

interface Product
{
	int getProduceTime();
}

interface Output
{
	int MAX_CACHE_LINE = 50;
	void out();
	void getData(String msg);
}

public class Printer implements Output, Product
{
	private String[] printData = new String[MAX_CACHE_LINE];
        private int dataNum = 0;
	public void out()
	{
		while(dataNum > 0)
		{
			System.out.println("printer print"+printData[0]);
			//
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}

	}
	public void getData(String msg)
	{
		if (dataNum >= MAX_CACHE_LINE)
		{
			System.out.println("the output line is full");

		}
	        else
		{
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime()
	{
		return 45;
	}
	public static void main(String[] args)
	{
		Output o = new Printer();
		o.getData("1234567890");
		o.getData("8888888888888");
		o.out();


	}


}
