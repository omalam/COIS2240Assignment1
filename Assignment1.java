abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
	dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
	dateCreated = new java.util.Date();
	this.color = color;
	this.filled = filled;
    }

    /** Return color */
    public String getColor() {
	return color;
    }

    /** Set a new color */
    public void setColor(String color) {
	this.color = color;
    }

    /** Return filled. Since filled is boolean,
     * the get method is named isFilled */
    public boolean isFilled() {
	return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
	this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
	return dateCreated;
    }

    @Override
    public String toString() {
	return "created on " + dateCreated + "\ncolor: " + color +
	    " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    /** Constructs a default triangle with sides = 1.0 */
    public Triangle() {
	this(1.0, 1.0, 1.0);
    }

    /** Constructs a triangle with the given side lengths */
    public Triangle(double side1, double side2, double side3) {
	super();
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
    }

    /** Prints this triangle as a string */
    @Override
    public String toString() {
	return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    /** Returns the area of this triangle calculated with Heron's formula */
    public double getArea() {
	double s = this.getPerimeter() / 2.0;
	return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Returns the perimeter of this triangle */
    public double getPerimeter() {
	return side1 + side2 + side3;
    }

    /** Return side 1 */
    public double getSide1() {
	return side1;
    }

    /** Return side 2 */
    public double getSide2() {
	return side2;
    }

    /** Return side 3 */
    public double getSide3() {
	return side3;
    }

    /** Set a new side 1 */
    public void setSide1(double side1) {
	this.side1 = side1;
    }

    /** Set a new side 2 */
    public void setSide2(double side2) {
	this.side2 = side2;
    }

    /** Set a new side 3 */
    public void setSide3(double side3) {
	this.side3 = side3;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
	Triangle triangle = new Triangle(1, 1.5, 1);
	triangle.setColor("yellow");
	triangle.setFilled(true);
	System.out.println(triangle);
	System.out.println("The area is " + triangle.getArea());
	System.out.println("The perimeter is " + triangle.getPerimeter());
	System.out.println(triangle);
    }
}
