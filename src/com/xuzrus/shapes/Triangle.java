package com.xuzrus.shapes;

/**
 * This class contains methods and properties that
 * define a Triangle object.
 *
 * @author Jeremy McConnell
 * @see GeometricObject
 */
public class Triangle extends GeometricObject {

    private double[] sides = new double[3];

    private final double DEFAULT_SIDE_LENGTH = 1.0;

    /**
     * Object constructor
     */
    public Triangle() {

        this.sides[0] = this.DEFAULT_SIDE_LENGTH;
        this.sides[1] = this.DEFAULT_SIDE_LENGTH;
        this.sides[2] = this.DEFAULT_SIDE_LENGTH;

    }

    /**
     * Object constructor specifying a single side length
     *
     * @param side1 specifies the length of the first side
     */
    public Triangle(double side1) {

        this.sides[0] = side1;
        this.sides[1] = this.DEFAULT_SIDE_LENGTH;
        this.sides[2] = this.DEFAULT_SIDE_LENGTH;
    }

    /**
     * Object constructor specifying two side lengths
     *
     * @param side1 first side
     * @param side2 second side
     */
    public Triangle(double side1, double side2) {

        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = this.DEFAULT_SIDE_LENGTH;
    }

    /**
     *  Object constructor specifying all three side lengths
     *
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     */
    public Triangle(double side1, double side2, double side3) {

        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = side3;

    }

    /**
     * Accessor that gets the length of the specified side
     *
     * @param side the number of the side
     * @return the length of the specified side
     */
    public double getSide(int side) {

        return this.sides[side - 1];
    }

    /**
     * Mutator that sets the length of the specified side
     *
     * @param side  the number of the side
     * @param length the length to set the side to
     * @throws ArrayIndexOutOfBoundsException when the given side does not exist
     */
    public void setSide(int side, double length) {

        this.sides[side - 1] = length;
    }

    /**
     * Pseudo accessor that gets the area of the triangle
     *
     * @return the area of the triangle
     */
    public double getArea() {

        double a = this.sides[0];
        double b = this.sides[1];
        double c = this.sides[2];

        double semiperimeter = (a + b + c) / 2;

        double area = Math.sqrt(semiperimeter * (semiperimeter - c) * (semiperimeter - b) * ( semiperimeter - c));
        return area;

    }

    /**
     * Pseudo accessor that gets he perimeter of the triangle
     * @return the perimeter of the triangle
     */
    public double getPerimeter() {

        return (this.sides[0] + this.sides[1] + this.sides[2]);

    }





















}
