/*
 *Author: Nicholas Connelly
 *Date: January 30 2017
 *For: COIS 2240Assignment 1
 *Triangle Class
 */
package a1;

public class Triangle extends GeometricObject {

	//Side Length Variables
	private double side1;
	private double side2;
	private double side3;
	
	//Method that returns the length of side1
	public double getside1(){
		return side1;
	}
	
	//method that sets the length of side1 to the provided value
	public void setside1(double length){
		side1=length;
	}
	
	//method that returns the length of side2
	public double getside2(){
		return side2;
	}
	
	//method that sets the length of side2 to the provided value
	public void setside2(double length){
		side2=length;
	}
	
	//method that returns the length of side3
	public double getside3(){
		return side3;
	}
	
	//method that sets the length of side3 to the provided value
	public void setside3(double length){
		side3=length;
	}
	
	//Default Triangle Constructor
	public Triangle() {
		
		//Constructor defaults to side lengths of 1.0
		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;
		
	}

	//Triangle constructor (3 sides Specified)
	public Triangle(double a, double b, double c){
	
		//side lengths that are provided are passed
		this.side1=a;
		this.side2=b;
		this.side3=c;
	}
	
	//Triangle constructor (2 sides Specified)
	public Triangle(double a, double b){
		
		//the side lengths that are provided are passed and the other defaults to 1.0
		this.side1=a;
		this.side2=b;
		this.side3=1.0;
	}
	
	//Triangle constructor (1 side specified)
	public Triangle(double a){
		
		//the side length that is provided is passed and those that aren't default to 1.0
		this.side1=a;
		this.side2=1.0;
		this.side3=1.0;
	}

	@Override
	public double getArea() {
		//Method to return the area of a triangle
		
		//declare variables 
		double side4;
		double area;
				
		side4=(side1 + side2 +side3)/2;
		area= Math.sqrt(side4*(side4-side1)*(side4-side2)*(side4-side3));
		
		return area;
	}

	@Override
	public double getPerimeter() {
		//Method to return perimeter of a triangle
		
		double p;
		
		p=side1 + side2 +side3;
		return p;
	}
	
	@Override
	public String toString(){
		
		return "Triangle: Side 1:"+ side1 + " Side 2: " + side2+ " Side 3: "+ side3;
	}

}