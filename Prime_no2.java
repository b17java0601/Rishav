package name;
import java.util.Scanner;
public class Prime_no2 
{
public static void main(String args[])
{
	int n,m;
	int flag=0;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the no ");
	n=s.nextInt();
    m=n/2;
    for(int c=2;c<=m;c++)
    	{ 
    	if(n%c==0)
    	{
    	System.out.print("Entered no is NOT a prime no");	
    	flag=1;
    	}  
    	}
    if(flag==0)
    	System.out.print("Entered no is a prime no");
    	
}
}
