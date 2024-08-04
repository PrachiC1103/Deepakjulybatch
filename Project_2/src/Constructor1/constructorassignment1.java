package Constructor1;

public class constructorassignment1 {
	//default constructor
  public constructorassignment1() 
  {  
	  this(1,2,3);
	  System.out.println("default constructor");
	   }
  //one parameterized constructor
  public constructorassignment1(int a)
  {
	  this(4,5);
	  System.out.println("one parameterized constructor");  
  }
  //two parameterized constructor
  public constructorassignment1(int a, int b)
  {
	  this();
	  System.out.println("two parameterized constructor");  
  }
//three parameterized constructor
  public constructorassignment1(int a, int b, int c)
  {
	  System.out.println("three parameterized constructor");  
  }
  public static void main(String[] args)
  {
	  constructorassignment1 obj=new constructorassignment1(7);
	  }
  
}
