package name;
public class Pattern10 
{
	public static void main(String[] args) 
	{
		int i=1;
		for (int r=1;r<5;r++)
		{
			for(int c=1;c<r;c++)
			{
				if(c%i==0)
				{
					if(c==i)
					{
						System.out.print(c);
					}
				}
			i++;
			}
			System.out.println();
			}
	}

}
