package name;

public class Overriding
{

	public static void main(String[] args)
	{
	C obj= new C();
	int ans=obj.sum(1,20);
	System.out.print(ans);

	}
}
	class A
	{
		int sum(int x,int y)
	
	{
		return(x-y);
		
	}
}

class C extends A
{
int sum(int a,int b)
{
return(a+b);	
}
void disp()
{
	super.sum(10, 20);
	}
}