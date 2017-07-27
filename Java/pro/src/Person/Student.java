//test the protected private public

package Class.Person;


public class Student extends Person
{
	public Student(String name)
	{
		this.name=name;
	}
	public String talk()
	{
		return "Person talk() "+this.name;
	}
}

