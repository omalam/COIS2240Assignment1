package com.xuzrus.shapes;

public class Triangle extends  GeometricObject {

    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;

    private final double default_side_length = 1.0;

    public Triangle() {

        this.side1 = this.default_side_length;
        this.side2 = this.default_side_length;
        this.side3 = this.default_side_length;
    }

    public Triangle(double side1) {

        this.side1 = side1;
        this.side2 = this.default_side_length;
        this.side3 = this.default_side_length;
    }

    public Triangle(double side1, double side2) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = this.default_side_length;
    }

    public Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

}
