package name;
import java.util.Scanner;
public class Reverse
{
	public static void main(String[] args)
	{
		int n,r;int reverse=0;
		Scanner s= new Scanner(System.in);	
		System.out.print("Enter the no");
        n=s.nextInt();
    while(n!=0)
        {
        	r=n%10;
        	reverse=(reverse*10)+r;
        	n=(n-r)/10;
         }
    System.out.print(reverse);
}
}
