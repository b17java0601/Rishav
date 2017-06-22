package name;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class BUfferedReader2 
{

	String name;
	int roll_no;
	float marks1,marks2,marks3,Avg;
	InputStreamReader  i=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(i);
	
	void input()throws IOException
	{
		System.out.println("Enter your name");
		name=br.readLine();
		System.out.println("Enter your roll no");
		roll_no=Integer.parseInt(br.readLine());
		System.out.println("Enter marks of first subject");
		marks1=Float.parseFloat(br.readLine());
		System.out.println("Enter marks of second subject");
		marks2=Float.parseFloat(br.readLine());
		System.out.println("Enter marks of third subject");
		marks3=Float.parseFloat(br.readLine());
		Avg=(marks1+marks2+marks3)/3;
	
	
	}
	
	void output()
	{
		System.out.println(" name is "+name+" "+" roll no is "+roll_no+" Average marks are "+Avg);
		
	}
	
	
	public static void main(String[] args) throws IOException
	{
		BUfferedReader2 obj1=new BUfferedReader2();
		obj1.input();
		BUfferedReader2 obj2=new BUfferedReader2();
		obj2.input();
		BUfferedReader2 obj3=new BUfferedReader2();
		obj3.input();
	
		obj1.output();
		obj2.output();
		obj3.output();
	}

}
