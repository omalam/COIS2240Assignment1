package com.xuzrus.shapes;

public class Triangle extends  GeometricObject {

    private double[] sides = new double[3];

    private final double default_side_length = 1.0;

    /************************************************
     *  CONSTRUCTORS
     ************************************************/

    public Triangle() {

        this.sides[0] = this.default_side_length;
        this.sides[1] = this.default_side_length;
        this.sides[2] = this.default_side_length;

    }

    public Triangle(double side1) {

        this.sides[0] = side1;
        this.sides[1] = this.default_side_length;
        this.sides[2] = this.default_side_length;
    }

    public Triangle(double side1, double side2) {

        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = this.default_side_length;
    }

    public Triangle(double side1, double side2, double side3) {

        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = side3;

    }

    /************************************************
     *  REAL SETTERS/GETTERS
     ************************************************/

    public double getSide(int side) {

        return this.sides[side - 1];
    }

    public void setSide(int side, double length) {

        this.sides[side - 1] = length;
    }

    /************************************************
     *  PSEUDO SETTERS/GETTERS
     ************************************************/

    // Returns the area of the Triangle using Heron's Formula
    public double getArea() {

        double a = this.sides[0];
        double b = this.sides[1];
        double c = this.sides[2];

        double semiperimeter = (a + b + c) / 2;

        double area = sqrt(semiperimeter * (semiperimeter - c) * (semiperimeter - b) * ( semiperimeter - c));
        return area;

    }
}
