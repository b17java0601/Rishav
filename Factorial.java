package name;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args)
	{
		int no,i;
		int total=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no ");
		no=s.nextInt();
		for(i=0;i<no;i++)
		{
			total=total*(no-i);
		}
		System.out.print(total);
}	
	
}