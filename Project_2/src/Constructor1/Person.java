package Constructor1;

public class Person {

	String name;
	int age;
	String city;
	
	public Person (String name, int age, String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public void display()
	{
		System.out.println("Name of person is Prachi");
		System.out.println("Age is 41");
		System.out.println("City is Johannesburg");
	}
	public static void main(String[] args)
	{
       Person ob= new Person("Prachi", 41, "Johannesburg");
       ob.display();
 
}
}



