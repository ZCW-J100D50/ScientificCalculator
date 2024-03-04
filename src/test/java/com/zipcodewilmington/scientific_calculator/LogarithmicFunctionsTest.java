package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.LogarithmicFunctions;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LogarithmicFunctionsTest {
    LogarithmicFunctions log = new LogarithmicFunctions();

    @Test
    public void testLogarithmic() {
        double value = 5.0;
        double expected = 1.61;
        double actual = log.calculateLogarithmic(value);
        assertEquals(expected, actual);
    }
    @Test
    public void testInverseLogarithm() {
        double value = 1.0;
        double expected = 2.72;
        double actual = log.calculateInverseLogarithm(value);
        assertEquals(expected, actual);
    }
    @Test
    public void testNaturalLog() {
        double value = 4.0;
        double base = 2.0;
        double expected = 0.69;
        double actual = log.calculateNaturalLog(value,base);
        assertEquals(expected, actual);
    }
    
}

