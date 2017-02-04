public class Triangle extends GeometricObject {
	
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	
	/** Constructor for Triangle */
	protected Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Get/set for the data fields
	// side1 get
	public double getSide1() {
		return side1;
	}
	// side1 set
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	// side2 get
	public double getSide2() {
		return side2;
	}
	// side2 set
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	// side3 get
	public double getSide3() {
		return side3;
	}
	// side3 set
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	@Override
	public double getArea() {
		// Heron's formula: sqrt(s(s-a)(s-b)(s-c)) where s = 1/2(a + b + c)
		double s = (side1 + side2 + side3)/2.0;
		double x = (s * (s-side1) * (s-side2) * (s-side3));
		double area = Math.sqrt(x);
		return area;
	}

	@Override
	public double getPerimeter() {
		// return perimeter
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
}
