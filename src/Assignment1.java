import com.xuzrus.shapes;

/**
 * Class implements testing of Triangle object as
 * specified in the Assignment 1 instruction pdf
 *
 * @author Jeremy McConnell
 * @see com.xuzrus.shapes
 */
public class Assignment1 {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.printIn(triangle);
        System.out.printIn("The area is " + triangle.getArea());
        System.out.printIn("The perimeter is "
                + triangle.getPerimeter());
        System.out.printIn(triangle);
    }
}
