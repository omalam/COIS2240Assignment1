package MarcNeves;

import MarcNeves.GeometricObject;
import MarcNeves.Triangle;

public class Assignment1 {
	 public static void main(String[] args) {
	 Triangle triangle = new Triangle(1, 1.5, 1);
	 triangle.setColor("yellow");
	 triangle.setFilled(true);
	 System.out.println(triangle);
	 System.out.println("The area is " + triangle.getArea());
	 System.out.println("The perimeter is "
	 + triangle.getPerimeter());
	 System.out.println(triangle);
	 }
	}


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
	
	double a;
	double b;
	double c;
	
	protected Triangle(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	public void setFilled(boolean filled) {
		 super.setFilled(filled);;
		 }
	
	public boolean isFilled() {
		return super.isFilled();
	}
	
	public void setColor(String color) {
		super.setColor(color);
	} 
	
	 public String getColor() {
		 return super.getColor();
		 }
	 
	 public double getArea(){
		 double x =((a+b+c)/2);
		 double a1=(x-a);
		 double a2=(x-b);
		 double a3=(x-c);
		 return Math.sqrt(x*(a1)*(a2)*(a3));
	 }
	 /** Abstract method getPerimeter */
	 public double getPerimeter(){
		 return a+b+c;
	 }
	 
}