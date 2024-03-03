package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {
    Calculator calc = new Calculator();

    //WORK IN PROGRESS

    @Test //Testing Addition Function PASSED
    public void addTest() {
        calc.setCurrentValue(10);
        double result = calc.add(5);
        assertEquals(15, result,0.01);
    }

    @Test //Testing Subtraction Function PASSED
    public void subTest() {
        calc.setCurrentValue(10);
        double result = calc.sub(5);
        assertEquals(5, result, 0.01);
    }

    @Test //Testing Multiplication Function PASSED
    public void multiplyTest() {
        calc.setCurrentValue(10);
        double result = calc.multiply(2);
        assertEquals(20, result, 0.01);
    }

    @Test //Testing Division Function PASSED
    public void divideTest() {
        calc.setCurrentValue(10);
        double result = calc.divide(2);
        assertEquals(5, result, 0.01);
    }

    @Test //Testing Square Function PASSED
    public void squareTest() {
        calc.setCurrentValue(10);
        double result = calc.square();
        assertEquals(100, result, 0.01);
    }

    @Test //Testing Square Root Function PASSED
    public void squareRootTest() {
        calc.setCurrentValue(100);
        double result = calc.squareRoot();
        assertEquals(10, result, 0.01);
    }

    @Test //Testing Exponential Function PASSED
    public void exponentialTest() {
        calc.setCurrentValue(10);
        double result = calc.exponential(2);
        assertEquals(100, result, 0.01);
    }

    @Test //Testing Inverse Function PASSED
    public void inverseTest() {
        calc.setCurrentValue(2);
        double result = calc.inverse();
        assertEquals(.5, result, 0.01);
    }

    @Test //Testing Invert Sign Function PASSED
    public void invertSignTest() {
        calc.setCurrentValue(-10);
        double result = calc.invertSign();
        assertEquals(10, result, 0.01);
    }

}
