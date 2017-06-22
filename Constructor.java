package name;
class Constructor//9041250963
{
public static void main(String args[])
{
	Zoo obj=new Zoo(10);
	System.out.println();
}
}

class Yes
{
	int x;
	Yes(int a)
	{
		x=a;
		System.out.print("x is "+x);
	}

}
class Zoo extends Yes
{
	Zoo(int a)
	{
		super(a);
	}
	
}
