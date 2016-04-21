package com.goit.module_4.temperature;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TconverterTest {
    private Tconverter tconverter;

    @Test
    public void testCelsiusToFarengate() throws Exception {
        double cel = 20.5;
        double result = Tconverter.celsiusToFarengate(cel);
        assertEquals((cel * 1.8) + 32, result, 0.01);
    }

    @Test
    public void testFarengateToCelsius() throws Exception {
        double cel = 20.5;
        double result = Tconverter.farengateToCelsius(cel);
        assertEquals((cel - 32) / 1.8, result, 0.01);

    }
}