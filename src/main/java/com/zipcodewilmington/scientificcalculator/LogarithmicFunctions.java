package com.zipcodewilmington.scientificcalculator;

public class LogarithmicFunctions {
    // calculate the logarithmic	function of a given value then display it
    public double calculateLogarithmic( double value ) {
        double k = Math.log(value);
        return Math.round(k* 100.0) /100.0;
    }

// calculate the inverse logarithm of a given value then display it
    public  double calculateInverseLogarithm( double value ) {
        double k = Math.exp(value);
        return Math.round(k* 100.0) /100.0;
    }

// calculate the natural logarithm of a given value then display it
    public  double calculateNaturalLog( double value, double base ) {
        double k = Math.log((value) /(base));
        return Math.round(k* 100.0) /100.0;
    }

// calculate the inverse natural logarithm of a given value then display it
//    public  double calculateNaturalInverseLog( double value ) {
//        return Math.exp(value);
//    }

    public double factorial(double value){
        //5 ->1*2*3*4*5
        int res = 1;
        for (int i = 2; i <= value; i++)
            res = res * i;
        return res;
    }
}
