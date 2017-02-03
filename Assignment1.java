class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(double s1, double s2, double s3){
		
		double Side1 = s1;
		double Side2 = s2;
		double Side3 = s3;
		
		side1 = Side1;
		side2 = Side2;
		side3 = Side3;
	}
	
	public void setSide1(double s){
		side1 = s;
	}
	
	public void setSide2(double s){
		side2 = s;
	}
	
	public void setSide3(double s){
		side3 = s;
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public double getArea(){
		double p = side1 + side2 + side3;
		double Area = p * (p - side1) * (p - side2) * (p - side3);
		Area = Math.sqrt(Area);
		return Area;
	}
	
	public double getPerimeter(){
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}
	
	public String toString(){
		return "Triangle side 1 - " + side1 + " side 2 - " + side2 + " side 3 - " + side3;
	}
}
