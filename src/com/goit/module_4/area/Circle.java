package com.goit.module_4.area;

public class Circle extends Figure {

    private double radius;

   public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        if (radius<0) {
            throw new IllegalArgumentException("Radius of the circle can't be less than or equals to zero");
        }
        return Math.PI * (radius * radius);
    }
}
