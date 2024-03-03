package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.SimpleCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Created By Alice Gonzalez
public class TestMainApplication {
    SimpleCalculator simpleCalculator  = new SimpleCalculator();
    @Test
    public void Addition_Test(){
        assertEquals(8.0,simpleCalculator.calculator('+',3.0,5.0),0.0001);
    }

    @Test
    public void Multiplication_Test() {
        assertEquals(42.0,simpleCalculator.calculator('*',7.0,6.0),0.0001);
    }

    @Test
    public void Division_Test() {
        assertEquals(4.5,simpleCalculator.calculator('/',63.0,14.0),0.0001);
    }

    @Test
    public void Percentage_Test() {
        assertEquals(7.0,simpleCalculator.calculator('-',9.0,2.0),0.0001);
    }
    @Test
    public void Subtraction_Test() {
        assertEquals(-7.0,simpleCalculator.calculator('-',7.0,14.0),0.0001);
    }

}
