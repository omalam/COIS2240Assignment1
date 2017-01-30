package Assignment1;
//Cole Cameron
//0585035
public class Assignment1 
{
	 public static void main(String[] args) 
	 {
		 //create a new triangle object
	 Triangle triangle = new Triangle(1, 1.5, 1);
	 //set triangle color
	 triangle.setColor("yellow");
	 //set triangle filled
	 triangle.setFilled(true);
	 //Print out the triangle
	 System.out.println(triangle);
	 //print out the area
	 System.out.println("The area is " + triangle.getArea());
	 //print out the perimeter
	 System.out.println("The perimeter is "
	 + triangle.getPerimeter());
	 //print out the color
	 System.out.println("The color is: " + triangle.getColor());
	 //if the triangle is filled print out it is filled, if not print out it is not filled
	 if (triangle.isFilled())
	 {
	 System.out.println("The triangle is filled.");
	 }
	 else
	 {
		 System.out.println("The triangle is not filled");
	 }
	} 
}
