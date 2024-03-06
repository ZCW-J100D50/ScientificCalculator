package com.zipcodewilmington.scientificcalculator;

public class CoreCalculations {

    public double addition(double displayNum, double num){
        return displayNum + num;
    }


    public double subtraction(double displayNum, double num) {
        return displayNum - num;
    }

    public double multiplication(double displayNum, double num) {
        return displayNum*num;
    }

    public double division(double displayNum, double error) {
        if (error != 0) {
            displayNum /= error;

        } else {
            System.out.println("Err: Cannot divide a number by 0.\n");
            displayNum = Double.NaN;
        }
        return  displayNum;
    }

    public double square(double displayNum) {

        return displayNum*displayNum;
    }
    public double squareRoot(double displayNum) {

        if (displayNum >= 0) {
            displayNum = Math.sqrt(displayNum);
        } else {
            System.out.println("Err: user cannot take the square root of a negative number.");
            displayNum = Double.NaN;
        }
        return displayNum;
    }
    public double exponent(double displayNum, double exponent) {
        return Math.pow(displayNum,exponent);
    }
    public double inverse(double displayNum) {
        if (displayNum != 0) {
            displayNum = 1 / displayNum;
        } else {
            System.out.println("Err: user cannot take the inverse of 0.");
            displayNum = Double.NaN;
        }
        return displayNum;
    }
}
