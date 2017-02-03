class Triangle extends GeometricObject

{
	
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
		
	//constructor with arguments
	protected Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	//get methods
	protected double getSide1(Object Triangle)
	{
		return this.side1;
	}
	protected double getSide2(Object Triangle)
	{
		return this.side2;
	}
	protected double getSide3(Object Triangle)
	{
		return this.side3;
	}
	
	
	//set methods
	protected void setSide1(double side1)
	{
		this.side1 = side1;
	}
	protected void setSide2(double side2)
	{
		this.side2 = side2;
	}
	protected void setSide3(double side3)
	{
		this.side3 = side3;
	}
	
	//get area of triangle
	public double getArea()
	{
		
		double s = ((this.side1) + (this.side2) + (this.side3)) / 2;
		
		return Math.sqrt(((s) * (s - this.side1) * (s - this.side2) * (s - this.side3)));	
		
		
		
	}
	
	//get perimeter of triangle
	public double getPerimeter()
	{
		return ((this.side1) + (this.side2) + (this.side3));
	}
	
	//toString method
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;	
	}


	
	
	
} 