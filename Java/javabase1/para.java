public class para
{
	public static void main(String[] args)
	{
		int j = args.length;
		if(j!=2)
		{
			System.out.println("ERROR!");
			System.exit(1);
		}
		for (int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}
