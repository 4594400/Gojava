package com.goit.module_4.area;


public class Rectangle extends Figure {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        if (a<=0 || b<=0) {
            throw new IllegalArgumentException("Side of the rectangle can't be less than or equal to zero");
        }
        return a*b;
    }
}
