package name;

public class This1
{
 private double radius;
 public static void main(String args[])
     {
	 
	 This1  obj=new This1();
	 obj.getArea();
	 System.out.print(obj);
     }
	
	public This1(double radius)
	{
         this.radius=radius;
    }
	public This1()
	{
		this(1.0);
	}
   public double getArea()
   {
  return this.radius*this.radius*Math.PI;
  
}
}