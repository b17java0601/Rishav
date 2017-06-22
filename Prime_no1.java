package name;
import java.util.Scanner;
public class Prime_no1 
{

	public static void main(String[] args) 
	{ 
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no ");
		n=s.nextInt();
		for(int i=2;i<=n;i++)
		{
		if(n%i==0)
	{
		if(n==i)
		{
			System.out.print("Entered no is a prime no");
			break;
		}
		else
	{
			System.out.print("Entered no is NOT a prime no");
		break;
		
	}
		}
		}	
	}

}
