
public class Square extends Rectangle {
    double side;
  
    Square(double side)
	{
        super(side, side);
    }
    public double getArea() {
    	return side1 * side2;
    	}
    	public double getPerimeter() {
    	return 2 * (side1 + side2);
    	}
}
