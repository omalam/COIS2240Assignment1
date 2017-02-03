package Assignment1;

class Triangle extends GeometricObject 
{
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	
	/** Construct a triangle with side1, side2 and side3 values */
	protected Triangle(double side1, double side2, double side3)
	{
		this.setSide1(side1);
		this.setSide2(side2);
		this.setSide3(side3);
	}
	
	/** Return side1 */
	public double getSide1() 
	{
		return side1;
	}

	/** Set a new side1 */
	public void setSide1(double side1) 
	{
		this.side1 = side1;
	}
	
	/** Return side2 */
	public double getSide2() 
	{
		return side2;
	}

	/** Set a new side2 */
	public void setSide2(double side2) 
	{
		this.side2 = side2;
	}
	
	/** Return side3 */
	public double getSide3() 
	{
		return side3;
	}

	/** Set a new side3 */
	public void setSide3(double side3) 
	{
		this.side3 = side3;
	}
		
	/** Method that returns the area of the triangle using Heron's Formula*/
	public double getArea()
	{
		double p;
		p = getPerimeter();
		p = p/2;
		return (Math.sqrt(p*(p - side1)*(p - side2)*(p - side3)));
	}
	
	/** Method that returns the perimeter of the triangle */
	public double getPerimeter()
	{
		return (side1 + side2 + side3);		
	}
	
	@Override
	public String toString() 
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
	
}
