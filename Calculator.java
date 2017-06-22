package name;
import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args)
	{
		Scanner f=new Scanner(System.in);
		int no1;
	System.out.print("Enter first no.");
	no1=f.nextInt();
	int no2;
	System.out.print("Enter second no.");
	no2=f.nextInt();
	
		int choice;
		
		System.out.print("1,2,3,4");
		choice=f.nextInt();
		switch(choice)
		{
		case 1:
		int no3=no1+no2;
		System.out.print("Addition of nos is"+no3);
		break;
		case 2:
			int no4=no1-no2;
			System.out.print("Subtraction of nos is"+no4);	
			break;
		case 3:
			int no5=no1*no2;
			System.out.print("Multiplication of nos is"+no5);
			break;
		case 4:
			int no6=no1/no2;
			System.out.print("division of nos is"+no6);
			break;
			default:
				System.out.print("INVALID");
				}
		}

}
