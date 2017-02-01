package com.company;

class Triangle extends GeometricObject {

    /** Create side length data members */
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    /** Constructor for Triangle class that takes 3 side length parameters, sets the data members to be the parameter values*/
    protected Triangle (double firstSide, double secondSide, double thirdSide) {
        this.side1 = firstSide;
        this.side2 = secondSide;
        this.side3 = thirdSide;
        return;
    }

    /** Get/ Set values for side1, side2, side3 */
    protected double getSide1() {
        return side1;
    }
    protected double getSide2() {
        return side2;
    }
    protected double getSide3() {
        return side3;
    }

    /** Override getPerimeter method to calculate perimeter */
    @Override
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    /** Override getArea method to calculate area */
    @Override
    public double getArea() {
        double peri = side1 + side2 + side3;
        double area = Math.sqrt(peri * (peri - side1) * (peri - side2) * (peri - side3));
        return area;
    }

    /** Overrides toString method to print side lengths in neat fashion*/
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}