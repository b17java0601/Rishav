package name;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		byte marks;
		System.out.print("Enter your marks");
		marks=s.nextByte();
		if(marks<40)
		{
			System.out.print("FAIL");
				}
		else if(marks>=40&&marks<50)
		{System.out.print("Average");
}
		else if(marks>=50&&marks<70)
		{System.out.print("GOOD");}
		else if(marks>=70&&marks<85)
		{ System.out.print("Very Good");
		}
		else if(marks>=85)
		{System.out.print("Excellent");
		}
		else
		{System.out.print("Invalid");
		
		}
		}
		}