/**Description:
  *2017/07/24 ZW
  *purpose:
  *unchangable class become changable
  *
  */

package Class.Name0724;

class Name
{
	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getLastName()
	{
		return this.lastName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}

}

public class Person
{
	private final Name name;
	public Person(Name name)
	{
	//	this.name = new Name(name.getFirstName(),name.getLastName());
	//      this way we can make the class Person unchangable
	        this.name = name;
	}
	public Name getName()
	{
		return name;
	}

	public static void main(String[] args)
	{
		Name n = new Name("wu kong","sun");
		Person p = new Person(n);
		
		System.out.println(p.getName().getFirstName());

		n.setFirstName("ba jie");

		System.out.println(p.getName().getFirstName());
	}
}
