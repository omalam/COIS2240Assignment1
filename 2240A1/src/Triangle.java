public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle(double x, double y, double z) {
		this.side1 = x;
		this.side2 = y;
		this.side3 = z;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double x) {
		this.side1 = x;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double y) {
		this.side2 = y;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double z) {
		this.side3 = z;
	}

	public double getArea() {
		double p = ((side1 + side2 + side3) / 2);
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return area;
	}

	public double getPerimeter() {
		double p = ((side1 + side2 + side3));
		return p;
	}

	public String toString() {

		boolean x = isFilled();
		String w;

		if (x = true) {
			w = "filled";
		} else {
			w = "not filled";
		}

		System.out.println("The color of the triangle is: " + getColor());
		System.out.println("The triangle is " + w);

		return "Triangle: side 1 = " + side1 + ", side 2 = " + side2
				+ " and side 3 = " + side3;
	}
}