/**Description:
  *2017/07/24 ZW
  *purpose:
  *enum class 
  *
  */

package Class.TestSeason;

class Season
{
	private final String name;
	private final String desc;

	public static final Season SPRING = new Season("spring", "go for walk");
	public static final Season SUMMER = new Season("summer", "stay at home");
	public static final Season FALL = new Season("fall", "fruit and mature");
	public static final Season WINTER = new Season("winter", "snow white");

	public static Season getSeason(int seasonNum)
	{
		switch(seasonNum)
		{
			case 1:
				return SPRING;
			case 2:
				return SUMMER;
			case 3:
				return FALL;
			case 4:
				return WINTER;
			default:
				return null;
		}

	}
	private Season(String name, String desc)
	{
		this.name = name;
		this.desc = desc;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getDesc()
	{
		return this.desc;
	}
}

public class TestSeason
{
	public TestSeason(Season s)
	{
		System.out.println(s.getName()+", This is a"+ s.getDesc()+" season");
	}
	public static void main(String[] args)
	{
		new TestSeason(Season.getSeason(1));
	}

}
