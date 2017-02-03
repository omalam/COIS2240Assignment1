package Main;

 class Triangle extends GeometricObject {

	public double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	
	public Triangle(double s1, double s2, double s3){
		super(color, filled);
		s1 = side1;
		s2 = side2;
		s3 = side3;
	}
	
	public double setSide1 (double Side1){
		this.side1 = Side1;
		return Side1;
	}
	
	public double setSide2 (double Side2){
		this.side2 = Side2;
		return Side2;
	}
	
	public double setSide3 (double Side3){
		this.side3 = Side3;
		return Side3;
	}
	
	public double getSide1 (){
		return side1;
	}
	
	public double getSide2 (){
		return side2;
	}
	
	public double getSide3 (){
		return side3;
	}
	
	public double getArea(){
		double semi = (side1 + side2 + side3)/2;
		double calc = semi*(semi - side1)*(semi - side2)*(semi - side3);
		double area = Math.sqrt(calc);
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = (side1 + side2 + side3);
		return perimeter;
	}
	
	public String toString(){
		return "Triangle: side1 =" + side1 + "side 2 =" + side2 + " side 3 = " + side3;
	}
	
}
