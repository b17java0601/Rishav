package name;
import java.util.Scanner;
public class OOP1 
{
	String name;  //instance variable
	int roll_no;
	float marks;
	static String course="java";
Scanner s=new Scanner(System.in);

static
{
	System.out.println("HEllo");
}

void input()
{
	System.out.print("Enter your name ");
	name=s.nextLine();
	System.out.print("Enter your Roll no ");
	roll_no=s.nextInt();
	System.out.print("Enter your marks ");
	marks=s.nextFloat();
	
}
	
	
	void display()
	{
		System.out.println(" name is "+name+" "+" roll no is "+roll_no+" marks are "+marks);
	}
	

	
public static void main(String args[])

{
	OOP1 s1=new OOP1();
	s1.input();
	OOP1 s2=new OOP1();
	s2.input();
	OOP1 s3=new OOP1();
    s3.input();
   
    s1.display();
    s2.display();
    s3.display();
    
    if(s1.marks>s2.marks&&s1.marks>s3.marks)
    	System.out.print("Highest marks are "+s1.marks);
    else if(s2.marks>s1.marks&&s2.marks>s3.marks)
    	System.out.print("Highest marks are "+s2.marks);
    else if(s3.marks>s2.marks&&s3.marks>s2.marks)
    	System.out.print("Highest marks are "+s3.marks);
    else
    	System.out.print("sabka Highest marks");
}
}
