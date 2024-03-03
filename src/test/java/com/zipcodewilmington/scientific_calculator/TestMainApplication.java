package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificCalculator;
import com.zipcodewilmington.scientificcalculator.SimpleCalculator;
import org.junit.Test;

import static java.lang.Double.isNaN;
import static org.junit.Assert.assertEquals;

//Created By Alice Gonzalez
public class TestMainApplication {
    SimpleCalculator simpleCalculator  = new SimpleCalculator();

    @Test
    public void addition_Test(){
        assertEquals(8.0,simpleCalculator.calculator('+',3.0,5.0),0.0001);
    }

    @Test
    public void multiplication_Test() {
        assertEquals(42.0,simpleCalculator.calculator('*',7.0,6.0),0.0001);
    }

    @Test
    public void division_Test() {
        assertEquals(4.5,simpleCalculator.calculator('/',63.0,14.0),0.0001);
    }

    @Test
    public void percentage_Test() {
        assertEquals(7.0,simpleCalculator.calculator('-',9.0,2.0),0.0001);
    }
    @Test
    public void subtraction_Test() {
        assertEquals(-7.0,simpleCalculator.calculator('-',7.0,14.0),0.0001);
    }
    ScientificCalculator scientificCalculator = new ScientificCalculator();

    @Test
    public void square_Test() {
        assertEquals(9.61,scientificCalculator.square(3.1), 0.0001);
    }

    @Test
    public void squareRoot_Test() {
        assertEquals(2.6832,scientificCalculator.squareRoot(7.2), 0.0001);
    }

    @Test
    public void inverse_Test() {
        assertEquals(0.1851,scientificCalculator.inverse(5.4) , 0.0001);
    }

    @Test
    public void switchSign_Test() {
        assertEquals(-5.00, scientificCalculator.switchSign(5.00), 0.0001);

        assertEquals( 6.53,scientificCalculator.switchSign(-6.53) , 0.0001);
    }

    @Test
    public void sine_Test() {
        assertEquals(-0.8834,scientificCalculator.sine(5.2) , 0.0001);
    }

    @Test
    public void cosine_Test() {
        assertEquals(0.9931,scientificCalculator.cosine(6.4) , 0.0001);
    }

    @Test
    public void tangent_Test() {
        assertEquals(-5.2674,scientificCalculator.tangent(4.9) , 0.0001);
    }

    @Test
    public void inverseSine_Test() {
        assertEquals(0.2526,scientificCalculator.inverseSine(0.25) , 0.0001);
    }

    @Test
    public void inverseCosine_Test() {
        assertEquals(2.0409,scientificCalculator.inverseCosine(-0.453) , 0.0001);
    }
    @Test
    public void inverseTangent_Test() {
        assertEquals(-0.4281,scientificCalculator.inverseTangent(-0.4564) , 0.0001);
    }

    @Test
    public void factorial_Test() {
        assertEquals(720,scientificCalculator.factorial(6) , 0.0001);
    }

}
