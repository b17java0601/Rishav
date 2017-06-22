package name;
import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
	int no;
	int c = 0;
	Scanner s=new Scanner(System.in);
	System.out.print("enter the no");
	no=s.nextInt();
	int a=0,b=1;
	System.out.println(a+" "+b);
		for(int i=0;i<=no;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
        	
      
	}
	}

}
