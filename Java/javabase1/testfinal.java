//test the final variable(static final )

class Person
{
	
        String name;
	private static Person p = new Person();
	public int mark=1;

	private Person()
	{
		name = "Henry";
	}

	public static Person Getp()
	{
		return p;
	}
}

public class testfinal
{
	public static void main(String[] args)
	{
		Person p=null;
		p = Person.Getp();
		System.out.println(p.name+","+p.mark);
		p.mark = 2;
		p.name = "Hello";

		Person q=null;
		q = Person.Getp();
		System.out.println(q.name+","+q.mark);
	
	}

}


//when static varible is defined outside all the method, it is shared by all users of the class 
//So in this example, everytime we get p pointing to the same place, So they are the same.
