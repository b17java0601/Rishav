package name;
import java.util.Scanner;
public class Marks
{
	public static void main(String[] args)
	{
		int marks;
	Scanner s=new Scanner(System.in);
System.out.print("Enter your marks between 0 and 100");
marks=s.nextInt();
marks=marks/10;			
switch(marks)
{
case 0:
case 1:
case 2:
case 3:
case 4:
	System.out.print("Fail");
	break;
case 5:
case 6:
	System.out.print("Average");
break;
case 7:
case 8:
	System.out.print("Good");
	break;
case 9:
case10:
	System.out.print("Excellent");
break;
default:
System.out.print("Invalid Input");
	}
    }
}
