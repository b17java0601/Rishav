package name;
import java.util.Scanner;
public class Loops1 
{
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		int age;
System.out.print("Enter your age");
age=a.nextInt();
for(int i=age;i>18&&i<100;i++)
{
System.out.println(i);
}
}
}
