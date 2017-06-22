package name;

public class Patterncharacters 
{

	public static void main(String[] args)
	{
		System.out.println("     a");
		for(int r=1;r<=5;r++)
		{
			for(int s=4;s>=r;s--)
			System.out.print(" ");
			int alpha=97;
		
			for(int c=1;c<=r;c++)
       {
    	   System.out.print((char)alpha);
    	   alpha++;
    	   
       }
			
			for(int c=1;c<=r;c++)
    	   {
				System.out.print((char)alpha);  
				alpha--;
    	   }
			System.out.print("a");
	       System.out.println();
		}

	}
}
