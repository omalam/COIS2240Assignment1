public class Triangle extends GeometricObject{

	private double side1 = 1.0 , side2 = 1.0 , side3 = 1.0;
	
	// Constructs default Triangle
	public Triangle(){
	}
	
	// Constructs a triangle object with specified side lengths (side1, side2, side3).
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;		
	}
	
	// Sets new sides for side1, side2, and side3.
	public void setSide1(double side1){
		this.side1 = side1;
	}
	public void setSide2(double side2){
		this.side2 = side2;
	}
	public void setSide3(double side3){
		this.side3 = side3;
	}

	// Getters
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	
	// GetArea() returns the area of a triangle
	// Exists as an abstract method in GeometricObject
	public double getArea(){
		double s = ((side1 + side2 + side3) / 2);
		double area = Math.sqrt(s * (s-side1)* (s - side2) * (s - side3));
		return area;
	}
	
	// getPerimeter() returns the perimeter of a triangle.
	// Exists as an abstract method in GeometricObject.
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public String toString(){
		System.out.println("The color of the triangle is: " + getColor() + "\nIs filled?: " + isFilled());
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
