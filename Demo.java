package name;
class Parent
{
int x;

Parent()   //constructor
{
	System.out.println("PArent class constructor");
x=10;	
}
void disp()  //parent class method
{
	System.out.println("Parent class method  "+x);
	}

}

class Child extends Parent    //child class
{
	int y;
	Child()                 //constructor
	{
		System.out.println("Child class constructor");	
	y=20;
	}
	void show()         //child class method
	{
		
		System.out.println(x+" "+y);
		disp();
	}
}


public class Demo {

	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		System.out.print("Parent class constructor");
	}

}
