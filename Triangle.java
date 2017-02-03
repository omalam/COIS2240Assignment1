
public class Triangle extends GeometricObject {
	
	//initiating side1, side2, and side3
	public double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	
	//constructor method for sides of class triangle
	public Triangle(double length1, double length2, double length3){
		side1 = length1;
		side2 = length2;
		side3 = length3;
	}
	
	//setting methods for all three data fields
	public void set_side1(double side1){
		this.side1 = side1;
	}
	
	public void set_side2(double side2){
		this.side2 = side2;
	}
	
	public void set_side3(double side3){
		this.side3 = side3;
	}
	
	//getting methods for al three data fields
	public double get_side1(){
		return this.side1;
	}
	
	public double get_side2(){
		return this.side2;
	}
	
	public double get_side3(){
		return this.side3;
	}

	
	//s is the semiperimeter of the triangle. I got these equations from wikipedia
	@Override
	public double getArea() {
		double s, tempArea;
		s = (side1+side2+side3)/2;
		tempArea = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return tempArea;
	}

	@Override
	public double getPerimeter() {
		double tempPerimeter;
		tempPerimeter = side1 + side2 + side3;
		return tempPerimeter;
	}
	
	@Override
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + " created on " + getDateCreated() + "\ncolor: " + getColor() +
			      " and filled: " + isFilled();
	}

}
