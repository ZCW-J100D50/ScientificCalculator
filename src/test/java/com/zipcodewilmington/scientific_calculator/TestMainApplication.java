package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {
    Calculator calc = new Calculator();

    @Test //Testing Addition
    public void addTest() {
        double result  = calc.add(12);
        result = calc.add(13);
        assertEquals(25, result,0.01);
    }

    @Test //Testing Subtraction
    public void subTest() {
        double result = calc.sub(53);
        result = calc.sub(5);
        assertEquals(48, result, 0.01);
    }

    @Test //Testing Multiplication
    public void multiplyTest() {
        double result = calc.multiply(2);
        result = calc.multiply(2);
        assertEquals(4, result, 0.01);
    }

    @Test //Testing Division
    public void divideTest() {
        double result = calc.divide(2);
        result = calc.divide(2);
        assertEquals(1, result, 0.01);
    }

    @Test //Testing Square
    public void squareTest() {
        double result = calc.square(2);
        result = calc.square(2);
        assertEquals(4, result, 0.01);
    }

    @Test //Testing Square Root
    public void squareRootTest() {
        double result = calc.squareRoot(4);
        result = calc.squareRoot(4);
        assertEquals(2, result, 0.01);
    }






}
