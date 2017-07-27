/**Description:
  *2017/07/24 ZW
  *purpose:
  *make the class stored in the cache
  *
  */

package Class.Cache;

public class Cache
{
	private final String name;
	private static Cache[] cache = new Cache[10];
	private static int pos = 0;

	public Cache(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public static Cache valueOf(String name)
	{
		for(int i = 0; i < pos; i++)
		{
			if(cache[i] != null && cache[i].getName().equals(name))
			{
				return cache[i];
			}
		}

		if (pos == 10)
		{
			cache[0] = new Cache(name);
			pos = 1;
			return cache[0];
		}
		else
		{
			cache[pos++] = new Cache(name);
			return cache[pos-1];
		}
	}
	public boolean equals(Object obj)
	{
		if (obj instanceof Cache)
		{
			Cache c1 = (Cache)obj;

			if (name.equals(c1.getName()))
			{
				return true;
			}

		}

		return false;
		
	}
	public static void main(String[] args)
	{
		Cache c1 = Cache.valueOf("hello");
		Cache c2 = Cache.valueOf("hello");
		System.out.println(c1 == c2);
	}


}
