package com.xuzrus.shapes;

/**
 * This class contains methods and properties that
 * define a Triangle object.
 *
 * @author Jeremy McConnell
 * @see GeometricObject
 */
public class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    private final double DEFAULT_SIDE_LENGTH = 1.0;

    /**
     * Object constructor
     */
    public Triangle() {

        this.side1 = this.DEFAULT_SIDE_LENGTH;
        this.side2 = this.DEFAULT_SIDE_LENGTH;
        this.side3 = this.DEFAULT_SIDE_LENGTH;

    }

    /**
     * Object constructor specifying a single side length
     *
     * @param side1 specifies the length of the first side
     */
    public Triangle(double side1) {

        this.side1 = side1;
        this.side2 = this.DEFAULT_SIDE_LENGTH;
        this.side3 = this.DEFAULT_SIDE_LENGTH;
    }

    /**
     * Object constructor specifying two side lengths
     *
     * @param side1 first side
     * @param side2 second side
     */
    public Triangle(double side1, double side2) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = this.DEFAULT_SIDE_LENGTH;
    }

    /**
     *  Object constructor specifying all three side lengths
     *
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     */
    public Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    /**
     * Accessor that gets the length of side1
     *
     * @return the length of the side
     */
    public double getSide1() {

        return this.side1;
    }

    /**
     * Accessor that gets the length of side2
     *
     * @return the length of the side
     */
    public double getSide2() {

        return this.side2;
    }

    /**
     * Accessor that gets the length of side3
     *
     * @return the length of the side
     */
    public double getSide3() {

        return this.side3;
    }

    /**
     * Mutator that sets the length of side1
     *
     * @param length the length to set the side to
     */
    public void setSide1(double length) {

        this.side1 = length;
    }

    /**
     * Mutator that sets the length of side2
     *
     * @param length the length to set the side to
     */
    public void setSide2(double length) {

        this.side2 = length;
    }

    /**
     * Mutator that sets the length of side3
     *
     * @param length the length to set the side to
     */
    public void setSide3(double length) {

        this.side3 = length;
    }

    /**
     * Pseudo accessor that gets the area of the triangle
     *
     * @return the area of the triangle
     */
    public double getArea() {

        double a = this.side1;
        double b = this.side2;
        double c = this.side3;

        double semiperimeter = (a + b + c) / 2;

        double area = Math.sqrt(semiperimeter * (semiperimeter - c) * (semiperimeter - b) * ( semiperimeter - c));
        return area;

    }

    /**
     * Pseudo accessor that gets he perimeter of the triangle
     * @return the perimeter of the triangle
     */
    public double getPerimeter() {

        return (this.side1 + this.side2 + this.side3);

    }

    /**
     * Method that returns the a string description of the object
     * @return string description
     */
    @Override
    public String toString() {

        return "Triangle: side1 = " + this.side1
                + ", side2 = " + this.side2
                + ", side3 = " + this.side3;

    }





















}
