
public class Test {
	public static void main(String[] args) {
		
		GeometricObject gObjectArray [] = new GeometricObject[5];
		gObjectArray[0] = new circle(5);
		gObjectArray[1] = new Equilateral(5);
		gObjectArray[2] = new Triangle(5,5,5);
		gObjectArray[3] = new Rectangle(5,4);
		gObjectArray[4] = new Square(5);
		
		for(int i = 0; i < gObjectArray.length; i++){
		if(gObjectArray[i] != null)
		System.out.println("Area: " + gObjectArray[i].getArea() 
				+ " Perimeter: " + gObjectArray[i].getPerimeter());
		}
		}
}
