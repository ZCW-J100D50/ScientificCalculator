package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreCalculations;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CoreCalculationsTest {
    CoreCalculations coreTest = new CoreCalculations();

    @Test
    public void testAddition() {
        double a = 1.0;
        double b = 2.0;
        double expected = 3.0;
        double actual = coreTest.addition(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubtraction() {
        double a = 5.0;
        double b = 2.0;
        double expected = 3.0;
        double actual = coreTest.subtraction(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void testMulti(){
        double a = 5.0;
        double b= 5.0;
        double expected = 25.0;
        double actual = coreTest.multiplication(a,b);
        assertEquals(expected,actual);
    }
    @Test
    public void testDivision(){
        double a = 25.0;
        double b= 5.0;
        double expected = 5.0;
        double actual = coreTest.division(a,b);
        assertEquals(expected,actual);
    }
    @Test
    public void testDivisionError(){
        double a = 25.0;
        double b= 0.0;
        double expected = Double.NaN;
        double actual = coreTest.division(a,b);
        assertEquals(expected,actual);
    }
    @Test
    public void testSquare(){
        double a = 3.0;
        double expected = 9.0;
        double actual = coreTest.square(a);
        assertEquals(expected,actual);
    }
    @Test
    public void testSquareRoot(){
        double a = 9.0;
        double expected = 3.0;
        double actual = coreTest.squareRoot(a);
        assertEquals(expected,actual);
    }
    @Test
    public void testSquareRootError(){
        double a = -9.0;
        double expected = Double.NaN;
        double actual = coreTest.squareRoot(a);
        assertEquals(expected,actual);
    }
    @Test
    public void testExpo(){
        double a = 5.0;
        double power= 2.0;
        double expected = 25.0;
        double actual = coreTest.exponent(a,power);
        assertEquals(expected,actual);
    }
    @Test
    public void testInverse(){
        double a = 2;
        double expected = 0.5;
        double actual = coreTest.inverse(a);
        assertEquals(expected,actual);
    }
    @Test
    public void testInverseError(){
        double a = 0;
        double expected = Double.NaN;
        double actual = coreTest.inverse(a);
        assertEquals(expected,actual);
    }

}


