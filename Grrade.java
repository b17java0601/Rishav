package name;
import java.util.Scanner;
public class Grrade 
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
		char grade;
		
	System.out.print("enter your grade");
	grade=s.nextLine().charAt(0);
	switch(grade)
	{
	case 'a':
		System.out.print("Your marks lies between 85 and 100");
		break;
	case 'b':
		System.out.print("Your marks lies between 70 and 85");
		break;
	case 'c':
		System.out.print("Your marks lies between 50 and 70");
	    break;
	case 'd':
		System.out.print("Your marks lies between 40 and 50");
		break;
	case 'e':
		System.out.print("Your marks is less than 40");
	    break;
	default:
	System.out.print("Invalid");
	}
	}
}