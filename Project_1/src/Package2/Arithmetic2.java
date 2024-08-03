package Package2;

public class Arithmetic2 {
 public int sum(int a, int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("result is "+c);
	 System.out.printIn("changes done by PC");
	 return c;
 }
 public int sub(int a1, int b1)
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
 public void div(int a3, int b3)
 {
	 int result;
	 result=a3/b3;
	 System.out.println("final result is "+result);
 }
 public static void main(String[] args)
 {
	Arithmetic2 ob=new Arithmetic2() ;
	int sumresult1=ob.sum(10, 2);
	int sumresult2=ob.sum(sumresult1, 2);
	int subresult=ob.sub(sumresult2, 2);
	int multiresult= ob.multi(subresult, 2);
	ob.div(multiresult, 2);
 }
 
}
