package com.zipcodewilmington.scientificcalculator;

public class Trigonometry {

    // calculate the sine of a given value then display it
    public  double calculateSine(double value) {
        double k = Math.sin(Math.toRadians(value));
        return Math.round(k*100.0)/100.0;
    }

// calculate the cosine of a given value then display it
    public  double calculateCosine(double value) {
        double k = Math.cos(Math.toRadians(value));
        return Math.round(k* 100.0) /100.0;
    }

// calculate the tangent of a given value then display it
    public double calculateTangent( double value ) {
        double k =  Math.tan(Math.toRadians(value));
        return Math.round(k* 100.0) /100.0;
    }

// calculate the inverse sine of a given value then display it
    public double calculateInverseSine( double value ) {
        double k =  Math.asin(value);
        return Math.round(k* 100.0) /100.0;
    }

// calculate the inverse cosine of a given value then display it
    public double calculateInverseCosine( double value ) {
        double k = Math.acos(value);
        return Math.round(k* 100.0) /100.0;
    }

// calculate the inverse tangent of a given value then display it
    public double calculateInverseTangent ( double value ) {
        double k =  Math.atan(value);
        return Math.round(k* 100.0) /100.0;
    }
}
