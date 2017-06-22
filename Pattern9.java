package name;

public class Pattern9 {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int d;
		for(int r=1;r<=4;r++)
		{
			for(int space=3;space>=(2*r-1);space--)
			{
				  System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				  System.out.print(a+" ");
				  d=a+b;
			}
			for(int space=3;space>=(2*r-1);space--)
			{
				  System.out.print(" ");
			}
			  System.out.println();
		}

	}

}
