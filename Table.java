package name;
import java.util.Scanner;
public class Table 
{
	public static void main(String[] args) 
	{
	int n,a;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the no ");
	n=s.nextInt();
	for(int i=1;i<=10;i++)
	{
	a=n*i;
			System.out.println(n+" * "+i+" = "+a);
	}
	}

}
