package name;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReader3 
{

	int  ID;
    String name;
    String desig;
    float salary;
    InputStreamReader i=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(i);


	public static void main(String[] args)throws IOException
	
	
	{
		         BufferedReader3 obj1=new  BufferedReader3();
				 obj1.input();
				 BufferedReader3 obj2=new  BufferedReader3();
				 obj2.input();
				 BufferedReader3 obj3=new  BufferedReader3();
				 obj3.input();
	
	obj1.display();
	obj2.display();
	obj3.display();
	}


    void input()throws IOException
    {
    	System.out.println("Enter your ID");
    	ID=Integer.parseInt(br.readLine());
    	System.out.println("Enter your name");
    	name=br.readLine();
    	System.out.println("Enter your designation");
    	desig=br.readLine();
    	System.out.println("Enter your salary");
    	salary=Float.parseFloat(br.readLine());
    	
    	
    }
    
    void display()
    {
    System.out.println(" ID:"+ID+" name: "+name+" designaton: "+desig+" salary: " +salary);
    }
}



