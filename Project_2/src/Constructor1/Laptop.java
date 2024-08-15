package Constructor1;

public class Laptop {

String brand;
String model;
int price;
public Laptop (String a, String b, int c)
{
	brand=a;
	model=b;
	price=c;
	System.out.println("Laptop brand is " + brand);
	System.out.println("Laptop model is "+ model);
	System.out.println("Laptop price is "+ price);
}
public static void main(String[] args)
{
	Laptop ob= new Laptop("Dell", "Latitude", 5000);
}
}
