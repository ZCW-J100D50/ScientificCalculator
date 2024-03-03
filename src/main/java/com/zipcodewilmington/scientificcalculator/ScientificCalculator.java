package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {

    public double square(double x){
        return  x * x;
    }

    public double squareRoot(double x){
        return Math.sqrt(x);
    }

    public  double inverse(double x) {
        return 1 / x;
    }

    public  double switchSign(double x) {
        return -x;
    }

    public  double sine(double x) {
        return Math.sin(x);
    }

    public  double cosine(double x) {
        return Math.cos(x);
    }

    public  double tangent(double x) {
        return Math.tan(x);
    }

    public  double inverseSine(double x) {
        return Math.asin(x);
    }

    public  double inverseCosine(double x) {
        return Math.acos(x);
    }

    public  double inverseTangent(double x) {
        return Math.atan(x);
    }

    public  double factorial(double x) {
        if (x == 0) {
            return 1;
        }
        else{
            int result = 1;
            for (int i = 1;i<=x;i++){
                result*=i;
            }
            return result;
        }

    }



}
