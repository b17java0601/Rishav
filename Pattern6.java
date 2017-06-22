package name;

public class Pattern6 
{

	public static void main(String[] args) 
	{
		for(int r=1;r<=5;r++)
		{
			for(int space=4;space>=r;space--)
			{
				System.out.print(" ");
			}
		for(int c=1;c<=r;c++)
		{
			System.out.print(c);
		}
		System.out.println();
		}
		

	}

}
