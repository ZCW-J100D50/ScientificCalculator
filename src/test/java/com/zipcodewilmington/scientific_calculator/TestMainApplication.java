package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {
    Calculator calc = new Calculator();
    @Test //Test Comments

    public void addTest () {
        double result  = calc.add(12);
                result = calc.add(13);
        assertEquals(25,result,0.01);


    }





}
