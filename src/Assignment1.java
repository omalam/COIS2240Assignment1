public class Assignment1 {
 public static void main(String[] args) {
   Triangle triangle = new Triangle(1, 1.5, 1);
   triangle.setColor("yellow");
   triangle.setFilled(true);
   System.out.println(triangle);
   System.out.println("The area is " + triangle.getArea());
   System.out.println("The perimeter is "+ triangle.getPerimeter());
   System.out.println("The color is " + triangle.getColor());
   System.out.println("Triangle filled in? " + triangle.isFilled());
   System.out.println(triangle);
 }
}

class Triangle extends GeometricObject {
  private double side1, side2, side3;
  
  Triangle() {
    super();
    setSide1(1.0);
    setSide2(1.0);
    setSide3(1.0);
  }
  
  Triangle(double side1, double side2, double side3){
    super();
    this.setSide1(side1);
    this.setSide2(side2);
    this.setSide3(side3);
  }

  public double getSide1() { return side1; }
  public void setSide1(double side1) { this.side1 = side1; }
  public double getSide2() { return side2; }
  public void setSide2(double side2) { this.side2 = side2; }
  public double getSide3() { return side3; }
  public void setSide3(double side3) { this.side3 = side3; }
  
  
  public double getArea() {
    //Heron's Formula for the area of a triangle (http://www.mathopenref.com/heronsformula.html)
    double p = getPerimeter()/2;
    return Math.sqrt( p*(p-side1)*(p-side2)*(p-side3) );    
  }
  
  public double getPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }
  
  public String toString() {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }
  
} 