package com.goit.module_4.area;


public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        if (a<=0 || b<=0 || c<=0) {
            throw new IllegalArgumentException("Side of the triangle can't be less than or equal to zero");
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}
