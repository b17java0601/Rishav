package name;

public class Pattern_prime {
public static void main(String args[])
{
	int c;
	boolean flag=true;
	System.out.println("1'");
	System.out.println("1'2'");
	for(int r=1;r<=6;r++)
	{
		for(c=1;c<=r*3;c++)
		{
			for(int i=2;i<=c-1;i++)
			
			{	
				if(c%i==0)
				{
					flag=false;
				    break;
				    
				}
			    
			}	
			if(flag==true)
				System.out.print(c+"'");
						flag=true;
			}
		flag=true;
		System.out.println();	
	}

	
	}
}
