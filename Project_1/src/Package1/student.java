package Package1;

public class student 
{
 int rollno;
 int age;
 public void display1()
 {
	  System.out.println("Welcome to all of you");
	  
	 }	
 public void display2()
 {
	 System.out.println("Automation is very easy"); 
 }
 public static void main(String[] args) 
 {
   student prachi=new student();
   prachi.display1();
   prachi.display2();
  
   prachi.rollno=123;
   prachi.age=23;
   System.out.println("prachi rollno = "+ prachi.rollno); 
   System.out.println("prachi age =" +prachi.age );

   
}
}
