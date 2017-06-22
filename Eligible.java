package name;
import java.util.Scanner;
public class Eligible 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char gen;
		System.out.print("Enter your genger M/F");
		gen=s.nextLine().charAt(0);
		byte age;
		
		System.out.print("Enter your age");
		age=s.nextByte();
		
		if(gen=='m'&& age>=21)
		{
			System.out.print("Men is eligible");
			
		}
		else if(gen=='f'&&age>=18)
		{
			System.out.println("Women is eligible");
		}
		else
		{System.out.println("Invalid");
		}
	}
}


