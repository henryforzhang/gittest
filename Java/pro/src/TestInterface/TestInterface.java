/**Description:
  *2017/07/24 ZW
  *purpose:
  *test one advantage of interface 
  *Command containing code block is used as a form parameter
  */

package Class.TestInterface;

interface Command
{
	void process (int[] target);
}

class ProcessArray
{
	public void process(int[] target, Command cmd)
	{
		cmd.process(target);
	}
}

class PrintCommand implements Command
{
	public void process(int[] target)
	{
		for (int tmp : target)
		{
			System.out.println("Iteration: "+tmp);
		}
	}
}

class AddCommand implements Command
{
	public void process(int[] target)
	{
		int sum = 0;
		for (int tmp : target)
		{
			sum += tmp;
		}
		System.out.println("The sum: "+sum);
	}
}

public class TestInterface
{
	public static void main(String[] args)
	{
		ProcessArray pa = new ProcessArray();
		int[] target = {1, 2, 3, 4};
		pa.process(target, new PrintCommand());
		pa.process(target, new AddCommand());
	}
}
























