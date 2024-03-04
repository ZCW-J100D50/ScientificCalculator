package com.zipcodewilmington.scientificcalculator;

public class Trigonometry {

    // calculate the sine of a given value then display it
    public static double calculateSine(double value) {
        return (Math.sin(Math.toRadians(value)));
    }

// calculate the cosine of a given value then display it
    public static double calculateCosine(double value) {
        return Math.toRadians(value);
    }

// calculate the tangent of a given value then display it
    public static double calculateTangent( double value ) {
        return Math.toRadians(value);
    }

// calculate the inverse sine of a given value then display it
    public static double calculateInverseSine( double value ) {
        return Math.asin(value);
    }

// calculate the inverse cosine of a given value then display it
    public static double calculateInverseCosine( double value ) {
        return Math.acos(value);
    }

// calculate the inverse tangent of a given value then display it
    public static double calculateInverseTangent ( double value ) {
        return Math.toDegrees(Math.atan(value));
    }
}
