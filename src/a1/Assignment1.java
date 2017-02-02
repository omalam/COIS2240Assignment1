/*
 *Author: Nicholas Connelly
 *Date: January 30 2017
 *For: COIS 2240Assignment 1
 *Testing Class
 */
package a1;

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
	