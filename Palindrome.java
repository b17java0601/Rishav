package name;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args)
		{
			int n,r;int reverse=0;
			Scanner s= new Scanner(System.in);	
			System.out.print("Enter the no ");
	        n=s.nextInt();
	        int no=n;
	    while(n!=0)
	        {
	        	r=n%10;
	        	reverse=(reverse*10)+r;
	        	n=n/10;
	         }
	    if(no==reverse)
	    	System.out.print("Entered no. "+no+" is a palindrome");
	    else
	    	System.out.print("Entered no. "+no+" is not a palindrome");
     	}
}
