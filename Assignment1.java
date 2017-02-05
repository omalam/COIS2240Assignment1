public class Assignment1 {
    public static void main(String[] args) {

        //sets the width of the sides of the triangle, the colour and the fill

        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColour("yellow");
        triangle.setFilled(true);

        //prints out triangle side length, area, perimeter, fill, and colour

        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("Filled " + triangle.isFilled());
        System.out.println("Colour " + triangle.getColour());
    }
}

public abstract class GeometricObject {
    private String colour = "yellow";
    private boolean filled;
    private java.util.Date dateCreated;
    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.colour = colour;
        this.filled = filled;
    }
    /** Return colour */
    public String getColour() {
        return colour;
    }
    /** Set a new color */
    public void setColour(String color) {
        this.colour = colour;
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
        return "created on " + dateCreated + "\ncolor: " + colour +" and filled: " + filled;
    }
    /** Abstract method getArea */
    public abstract double getArea();
    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /**
     * Construct a triangle object with given inputs
     */
    protected Triangle(double x, double y, double z) {
        side1 = x;
        side2 = y;
        side3 = z;
    }

    /**
     * get side1 and returns it
     */
    public double getSide1() {
        return side1;
    }

    /**
     * set side1 to given input
     */
    public void setSide1(double x) {
        this.side1 = x;
    }

    /**
     * get side2 and returns it
     */
    public double getSide2() {
        return side2;
    }

    /**
     * set side2 to given input
     */
    public void setSide2(double x) {
        this.side2 = x;
    }

    /**
     * get side3 and returns it
     */
    public double getSide3() {
        return side3;
    }

    /**
     * set side3 to given input
     */
    public void setSide3(double x) {
        this.side3 = x;
    }

    /**
     * Calculates area using Heron's Method and returns the result
     */
    public double getArea() {
        double per = this.getPerimeter() / 2;
        double area = Math.sqrt(per * (per - side1) * (per - side2) * (per - side3));
        return area;
    }

    /**
     * Calculates perimeter and returns the result
     */
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    /**
     * toString as specified
     */
    public String toString() {
        return "Triange: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
