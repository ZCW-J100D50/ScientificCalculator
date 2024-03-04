package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Trigonometry;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrigonometryTest {
    Trigonometry trig = new Trigonometry();
    @Test
    public void testSine() {
        double value = 30;
        double expected = 0.5;
        double actual = trig.calculateSine(value);
        assertEquals(expected, actual);
    }
    @Test
    public void testCosine() {
        double value = 60;
        double expected = 0.5;
        double actual = trig.calculateCosine(value);
        assertEquals(expected, actual);

    }
    @Test
    public void testTangent() {
        double value = 45;
        double expected = 1.0;
        double actual = trig.calculateTangent(value);
        assertEquals(expected, actual);
    }
    @Test
    public void testInverseSin() {
        double value = 1.0;
        double expected = 1.57;
        double actual = trig.calculateInverseSine(value);
        assertEquals(expected, actual);
    }
    @Test
    public void testInverseSCosine() {
        double value = 1.0;
        double expected = 0.0;
        double actual = trig.calculateInverseCosine(value);
        assertEquals(expected, actual);
    }
    @Test
    public void testInverseTangent() {
        double value = 1.0;
        double expected = 0.79;
        double actual = trig.calculateInverseTangent(value);
        assertEquals(expected, actual);
    }




}
