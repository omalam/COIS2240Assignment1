package Assignment1;

class Triangle extends GeometricObject 
{ 
	//Data fields for triangle sides
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//Constructor for a triangle with specified sides
	public Triangle(double side1, double side2, double side3)
	{
		//Set side 1
		setSide1(side1);
		//Set side 2
		setSide2(side2);
		//Set side 3
		setSide3(side3);
	}

	//Overidden getArea() method from the GeometricObject class
	@Override
	public double getArea() 
	{
		//determines half the perimeter
		double dHalfPerim = getPerimeter()/2;
		//calculates area from side lengths
		double dArea = Math.sqrt(dHalfPerim*(dHalfPerim-side1)*(dHalfPerim-side2)*(dHalfPerim-side3));
		//Returns area
		return dArea;
	}
	
	//Overrriden getPerimeter() method from Geormetric Object class
	@Override
	public double getPerimeter() 
	{
		//calculates perimeter
		double dPerimeter = side1 + side2 + side3;
		//returns perimeter
		return dPerimeter;
	}
	
	//Overriden toString() method 
	@Override
	public String toString()
	{
		//Returns the triangle sides individually labeled in the string
		return "Triangle side1 = " + side1 + " side2 = " + side2 +
				 " side3 = " + side3;
	}
	//getter for side1
	public double getSide1() 
	{
		return side1;
	}
	//setter for side1
	public void setSide1(double side1) 
	{
		this.side1 = side1;
	}
	//getter for side2
	public double getSide2() 
	{
		return side2;
	}
	//setter for side2
	public void setSide2(double side2) 
	{
		this.side2 = side2;
	}
	//getter for side3
	public double getSide3() 
	{
		return side3;
	}
	//setter for side 3
	public void setSide3(double side3) 
	{
		this.side3 = side3;
	}

}
