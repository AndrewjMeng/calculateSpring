package com.example.calculateSpring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MathServiceTest {
    @Test
    public void getSum() {
        MathService mathService = new MathService();
        String[] test = new String[3];
        test[0] = "4";
        test[1] = "5";
        test[2] = "6";

        assertEquals("4 + 5 + 6 = 15",mathService.getSum(test));
    }
    @Test
    public void CalculateInfoAdd() {
        MathService mathService = new MathService();
        assertEquals("4 + 6 = 10",mathService.CalculateInfo("add", 4, 6));
    }
    @Test
    public void CalculateInfoSubtract() {
        MathService mathService = new MathService();
        assertEquals("4 - 6 = -2",mathService.CalculateInfo("subtract", 4, 6));
    }
    @Test
    public void CalculateInfoMultiply() {
        MathService mathService = new MathService();
        assertEquals("4 * 6 = 24",mathService.CalculateInfo("multiply", 4, 6));
    }
    @Test
    public void CalculateInfoDivide() {
        MathService mathService = new MathService();
        assertEquals("30 / 5 = 6",mathService.CalculateInfo("divide", 30, 5));
    }
    @Test
    public void CalculateInfoDefault() {
        MathService mathService = new MathService();
        assertEquals("30 + 5 = 35",mathService.CalculateInfo("not math", 30, 5));
    }
}
