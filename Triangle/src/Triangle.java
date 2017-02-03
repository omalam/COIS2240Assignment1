
class Triangle extends GeometricObject {
	
 private double side1;
 private double side2;
 private double side3;

public Triangle(){
	side1 = 1.0;
	side2 = 1.0;
	side3 = 1.0;
}
 public Triangle(int a, double b, int c){
	 side1 = a;
	 side2 = b;
	 side3 = c;
 }

 //Assuming the length x width is (side1*side2)
 public double getArea(){
	 double area = (side1*side2)/2;
	 return area;
 }
 
 public double getPerimeter(){
	 double perimeter = side1+side2+side3;
	 return perimeter;
 }
 
 public double getSide1() {
	   return this.side1;
	} 
 
 public double getSide2() {
	   return this.side2;
	}
 
 public double getSide3() {
	   return this.side3;
	}

 public String toString(){
	 
	 return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 +
			 " side3 = " + this.side3;
 }
}

 
