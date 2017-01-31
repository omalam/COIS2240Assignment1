 public class Assignment1  {

	  public static void main(String[] args) {
		  
	  Triangle triangle = new Triangle(1, 1.5, 1);
	    triangle.setColor(" Yellow");
	    triangle.setFilled(true);
	    System.out.println(""+ triangle);
	    System.out.println("The triangle is filled "+ triangle.isFilled());
	    System.out.println("The colour of the triangle is" + triangle.getColor());
	    System.out.println("The area is " + triangle.getArea());
	    System.out.println("The perimeter is "
	      + triangle.getPerimeter());
	   
	}
 }
	abstract class TheGeometricObject {
	    private String color = " white ";
	    private boolean filled;
	    private java.util.Date dateCreated;

	    public TheGeometricObject() {
	        dateCreated = new java.util.Date();
	    }

	    public TheGeometricObject(String color, boolean filled) {
	        dateCreated = new java.util.Date();
	        this.color = color;
	        this.filled = filled;   
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public boolean isFilled() {
	        return filled;
	    }

	    public void setFilled(boolean filled) {
	        this.filled = filled;
	    }

	    public java.util.Date getDateCreated() {
	        return dateCreated;
	    }

	    public String toString() {
	        return "Created on " + dateCreated + "\n color: " + color + " and filled ";                 
	    }  
	   
	 }

	 class Triangle extends TheGeometricObject {
	    private double side1 = 1.0;
	    private double side2 = 1.5;
	    private double side3 = 1.0;

	  

	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }
	    public double getSide1() {
	        return side1;
	    }

	    public double getSide2() {
	        return side2;
	    }

	    public double getSide3() {
	        return side3;
	    }

	    public void setSide1(double side1) {
	        this.side1 = side1;
	    }

	    public void setSide2(double side2) {
	        this.side2 = side2;
	    }

	    public void setSide3(double side3) {
	        this.side3 = side2;
	    }

	    public double getArea() {
	    	double p = getPerimeter() / 2;
	    		    return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	    }

	    public double getPerimeter() {
	        return side1 + side2 + side3;
	    }

	    public String toString() {
	    return "The triangles sides are: Side 1 = " + side1 + " Side 2 = " + side2
	           + " Side 3 = " + side3;
	    }
	  }
 
	                                                                                             


