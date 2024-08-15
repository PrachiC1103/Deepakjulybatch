package Constructor1;
public class assignment10aug {
	
	public void defaultmethod1() 
	  {  
		  this.method3(1,2,3);
		  System.out.println("default method");
		   }  
	  public void method1(int a)
	  {
		  this.defaultmethod1();
		  System.out.println("one parameterized method");  
	  }  
	  public void method2(int b, int c)
	  {
		  this.method1(4);
		  System.out.println("two parameterized method");  
	  }
	  public void method3(int d, int e, int f)
	  {
		  System.out.println("three parameterized method");  
	  }
	  public void method4(int g, int h, int i, int j)
	  {
	   this.method2(5,6);
		  System.out.println("four parameterized method");  
	  }
	  public static void main(String[] args)
	  {
		  assignment10aug ob =new assignment10aug();
		  ob.method4(7,8,9,10);
		  }
	}

