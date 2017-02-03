package scottlarterAssignment1;

public class Assignment1 {
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle(1, 1.5, 1);
		triangle.setColor("yellow");
		triangle.setFilled(true);
		
		System.out.println(triangle);
		System.out.println("The area is " + triangle.getArea());
		System.out.println("The perimeter is " + triangle.getPerimeter());
	}
}


abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// Construct a default geometric object
	protected GeometricObject () {
		dateCreated = new java.util.Date();
	}
	
	// Construct a geometric object with color and filled value
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	// Return color
	public String getColor() {
		return color;
	}
	
	// Set a new color
	public void setColor(String color) {
		this.color = color;
	}
	
	/* Return filled.  Since filled is boolean,
	 * the get method is named isFilled */
	public boolean isFilled() {
		return filled;
	}
	
	// Set a new filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Get dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "created in " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
	
	// Abstract method getArea
	public abstract double getArea();
	
	// Abstract method getPerimeter
	public abstract double getPerimeter();
}


class Triangle extends GeometricObject {
	private double side1, side2, side3;
	
	// No argument constructor
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	// Constructor that takes three side lengths
	public Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Get side1
	public double getSide1() {
		return this.side1;
	}
	
	// Set side1
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	// Get side2
	public double getSide2() {
		return this.side2;
	}
	
	// Set side2
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	// Get side3
	public double getSide3() {
		return this.side3;
	}
	
	// Set side3
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	// Define method get Area
	public double getArea() {
		double halfp = (getPerimeter())/2;
		double area = Math.sqrt(halfp*(halfp-getSide1())*(halfp-getSide2())*(halfp-getSide3()));
		return area;
	}
	
	// Define method getPerimeter
	public double getPerimeter() {
		double perimeter = getSide1() + getSide2() + getSide3();
		return perimeter;
	}
	
	// override toString method
	public String toString() {
		return "Triangle: side1 = " + side1 + " side 2 = " + side2 +
					" side3 = " + side3 + "\n" +super.toString();
	}
}