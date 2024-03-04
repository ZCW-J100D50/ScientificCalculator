package com.zipcodewilmington.scientificcalculator;

public class LogarithmicFunctions {
    // calculate the logarithmic	function of a given value then display it
    public static double calculateLogarithmic( double value ) {
        return Math.log(value);
    }

// calculate the inverse logarithm of a given value then display it
    public static double calculateInverseLogarithm( double value ) {
        return Math.exp(value);
    }

// calculate the natural logarithm of a given value then display it
    public static double calculateNaturalLog( double value, double base ) {
        return Math.log(value) / Math.log(base);
    }

// calculate the inverse natural logarithm of a given value then display it
    public static double calculateNaturalInverseLog( double value ) {
        return Math.exp(value);
    }
}
