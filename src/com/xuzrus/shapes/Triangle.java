package com.xuzrus.shapes;

public class Triangle extends  GeometricObject {

    private double[] sides = new array[3];

    private final double default_side_length = 1.0;

    public double getSide(int side) {

        return this.sides[side - 1];
    }

    public void setSide(int side, double length) {

        this.sides[side - 1] = length;
    }

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

}
