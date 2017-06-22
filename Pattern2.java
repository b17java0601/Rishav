package name;
import java.util.Scanner;
public class Pattern2 
{
	public static void main(String[] args) 
	{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the no. ");
	n=s.nextInt();
for(int r=1;r<=n;r++)
{for(int c=1;c<=r;c++)
{System.out.print(c+",");
}
System.out.println();	
	}
	}

}
