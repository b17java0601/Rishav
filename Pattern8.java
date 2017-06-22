package name;
public class Pattern8
{
	public static void main(String[] args) 
	{
	for(int r=1;r<=5;r++)
	{
		for (int space=4;space>=r;space--)
		{
			System.out.print(" ");
		}	
		for(int c=1;c<=(2*r-1);c++)
		{
			System.out.print("*");
		}
		System.out.println();	}
	}

}
