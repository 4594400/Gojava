package com.goit.module_4.montecarlo;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class MonteCarloTest {
    private MonteCarlo monteCarlo;

    @Test
    public void testMontecarloIntegration1() throws Exception {
        double a = 0;
        double b = 1;
        long iterations = 10_000_000;
        int round = 5;
        double result = MonteCarlo.montecarloIntegration(a, b, iterations, round).doubleValue();
        assertEquals(0.8437, result, 0.01);
    }
    @Test (timeout = 1100)
    public void testMontecarloIntegration2() throws Exception {
        double a = 0;
        double b = 2;
        long iterations = 10_000_000;
        int round = 5;
        double result = MonteCarlo.montecarloIntegration(a, b, iterations, round).doubleValue();
        assertEquals(0.9092, result, 0.01);
    }
}