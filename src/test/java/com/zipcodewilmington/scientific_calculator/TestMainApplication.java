package com.zipcodewilmington.scientific_calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18. Test
 */

//public class TestMainApplication {
//
//    @Test
//    public void additionTest(){
//        assertEquals(20,);
//    }

//package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Core2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestMainApplication {

    @Test
    public void addition() {
        Core2 addition = new Core2();
        assertEquals(1429.5, addition.addition(845,   584.5), 0);

    }


    @Test
    public void subtraction() {
        Core2 subtraction = new Core2();
        assertEquals(53.2, subtraction.subtraction(68.5, 15.3), 0);

    }


    @Test
    public void multiplication(){
        Core2 multiplication = new Core2();
        assertEquals(925, multiplication.multiplication(25,37),0 );

    }

    @Test
    public void division(){
        Core2 division = new Core2();
        assertEquals(169.2, division.division(846,5),0 );

    }

    @Test
    public void square(){
        Core2 square = new Core2();
        assertEquals(36,square.square(6),0 );

    }

    @Test
    public void squareRoot(){
        Core2 squareRoot = new Core2();
        assertEquals(8.06225774829855, squareRoot.squareRoot(65), 0 );

    }

    @Test
    public void exponentation(){
        Core2 exponentation = new Core2();
        assertEquals(196, exponentation.exponentation(14,2),0 );

    }

    @Test
    public void inverse(){
        Core2 inverse = new Core2();
        assertEquals(0.1, inverse.inverse(10),0 );

    }

    @Test
    public void invert(){
        Core2 invert = new Core2();
        assertEquals(-5, invert.invert(5),0 );

    }




}


