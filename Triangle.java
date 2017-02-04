class Triangle extends GeometricObject {
 // Implement it
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public Triangle(			
			double side1,
			double side2,
			double side3)
	{
		super();
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
			
	}
	
	public double getArea()
	{
		double s=(side1+side2+side3)/2.0;
		double area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	 public double getPerimeter()
	 {
		double p=side1+side2+side3;
		
	 return p; 
	 }
	 
	 public  String toString()
	 {
		 
		 return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				 " side3 = " + side3 + "\n"+super.toString();
		 
	 }
	 
	
	
	
	
} 