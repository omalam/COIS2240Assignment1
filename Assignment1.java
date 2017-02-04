public class Assignment1 {
	public static void main(String[] args) 
	{
		Triangle triangle = new Triangle(1, 1.5, 1);
		triangle.setColor("YELLOW");
		triangle.setFilled(true);
		System.out.println(triangle);
		System.out.println("THE AREA IS " + triangle.getArea());
		System.out.println("THE PERIMETER IS " + triangle.getPerimeter());

	}
}
