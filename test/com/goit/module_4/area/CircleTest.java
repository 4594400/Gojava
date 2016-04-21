package com.goit.module_4.area;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CircleTest {

    @Test
    public void testArea1() throws Exception {
        double radius = 3;

        Circle circle = new Circle(radius);
        double result = circle.area();
        assertEquals(Math.PI*radius*radius, result, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArea2() throws Exception {
        double radius = -5;
        Circle circle = new Circle(radius);
        circle.area();
    }

}