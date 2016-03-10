package com.goit.module_4.area;

public class Circle extends Figure {

    private double radius;

   public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}
