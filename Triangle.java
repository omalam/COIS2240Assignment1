public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	// private double area = 1.0;
	private double perimeter = 1.0;
	
	public Triangle () {
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double setSide1() {
		return side1;
	}
	
	public double setSide2() {
		return side2;
	}
	
	public double setSide3() {
		return side3;
	}
	
	public double getArea() {
	    double p = getPerimeter() / 2;
	    return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}

	public double getPerimeter() {
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	
	@Override
	public String toString() {
	return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3 + "\ncreated on " + dateCreated + "\ncolor: " + color +
	" and filled: " + filled;
	}
	
	
}	
