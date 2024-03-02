package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.SimpleCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

  //HERE"S MY CHANGE FOR GIT HUB///
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    SimpleCalculator simpleCalculator  = new SimpleCalculator();


            @Test
            public void test_Addition_Double_and_Double_Input(){

        /** Checking addition! Checking double and double inputs*/
        assertEquals(9.0,simpleCalculator.calculator('+',3.0,5.0),0.0001);

            }


            @Test
            public void test_Subtraction_Double_and_Double_Input() {
                /** Checking subtraction! Checking double and double inputs*/
                assertEquals(9.0,simpleCalculator.calculator('-',3.0,5.0),0.0001);
            }



}
