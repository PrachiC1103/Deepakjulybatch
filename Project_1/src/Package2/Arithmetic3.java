package Package2;

public class Arithmetic3 {

	public int div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("result is "+c);
		System.out.printIn("changes done by PC");
		 return c;
	}
	public int sub1(int a1, int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("result is "+c1);
		return c1;
	}
	public int multi(int a2, int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("result is "+c2);
		return c2;
	}
	public int sub3(int a3, int b3)
	{
	int c3;
	c3=a3-b3;
	System.out.println("result is "+c3);
	return c3;
	}
	public void sum1(int a4, int b4)
	{
		int result;
		result=a4+b4;
		System.out.println("final result is "+result);
	}
	public static void main(String[] args)
	{
	Arithmetic3 ob= new Arithmetic3();
	int divresult1=ob.div(10, 2);
	int subresult2= ob.sub1(divresult1, 2);
	int multiresult3= ob.multi(subresult2, 2);
	int subresult4= ob.sub3(multiresult3, 2);
	ob.sum1(subresult4, 2);	
	}
}
