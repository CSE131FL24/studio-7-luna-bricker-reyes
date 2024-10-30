package studio7;

public class Rectangle {

	private double length;
	private double width;
 
	
	public Rectangle(double lengthx , double widthy)
	{
		length = lengthx;
		width = widthy;
	}
	
	
	public double Area()
	{
		double area= length*width;
		return area;
	}
	public double Perimeter()
	{
		double perimeter=2*(length+width);
		return perimeter;
	}
	public boolean Square()
	{
		  if (length == width) {
		return true;  } 
		   return false;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public boolean Square(Rectangle otherRectangle)
	{
		  if( otherRectangle.Area()<length*width)
		  {
			  return false;
		  }
		  return true;
	}
	
	
	
	
	
	
	
	
	
	
	
}
