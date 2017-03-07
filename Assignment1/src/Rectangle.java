public class Rectangle extends GeometricObject {

public double side1;
public double side2;

public Rectangle() { side1 = 1.0; side2 = 1.0; }

public Rectangle(double width, double side2) {
this.side1 = width; this.side2 = side2;
}
public double getWidth() { return side1; }

public void setWidth(double w){ side1 = w; }

public double getHeight() { return side2; }

public void setHeight(double h) { side2 = h; }

public double getArea() {
return side1 * side2;
}
public double getPerimeter() {
return 2 * (side1 + side2);
}
}