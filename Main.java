package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        /** Create a new triangle, providing the side lengths */
        Triangle triangle = new Triangle(1, 1.5, 1);

        /** Set the colour of the triangle to yellow */
        triangle.setColor("yellow");

        /** Set the triangle to be filled */
        triangle.setFilled(true);

        /** Create boolean data field to check if the triangle is filled, for printing */
        boolean fill = triangle.checkFilled();

        /** Creates a new format for numbers to only have 2 decimals */
        DecimalFormat f = new DecimalFormat("##.00");

        /** Print all values of the triangle (sides, colour, fill, area, and perimeter) */
        System.out.println(triangle);
        System.out.println("The colour is " + triangle.getColor());

        /** Prints different statements for if the triangle is filled or not */
        if (fill = true) {
            System.out.println("The triangle is filled");
        }
        else {
            System.out.println("The triangle is not filled");
        }

        System.out.println("The area is " + f.format(triangle.getArea()));
        System.out.println("The perimeter is "
                + triangle.getPerimeter());

    }
}

