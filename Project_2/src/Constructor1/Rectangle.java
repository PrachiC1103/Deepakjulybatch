package Constructor1;

public class Rectangle {

	int length;
	int width;
	
	public Rectangle (int length, int width)
	{
		this.length =length;
		this.width =width;
	}
	public void Area()
	{
		int Area = length *width;
		System.out.println("Area of Rectangle" + Area );
	}
	public static void main(String[] args)
	{
	Rectangle ob= new Rectangle(5,10);
	ob.Area();
	}
}
