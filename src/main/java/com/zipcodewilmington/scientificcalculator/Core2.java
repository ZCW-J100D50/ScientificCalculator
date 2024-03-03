package com.zipcodewilmington.scientificcalculator;

public class Core2 {


    public double addition(double userInput, double userInput2) {
        return userInput + userInput2;
    }

    public double subtraction(double userInput, double userInput2) {
        return userInput - userInput2;
    }

    public double multiplication(double userInput, double userInput2) {
        return userInput * userInput2;
    }

    public double division(double userInput, double userInput2) {
        return userInput / userInput2;
    }

    public double square(double userInput) {
        return userInput * userInput;
    }

    public double squareRoot(double userInput) {
        return Math.sqrt(userInput);
    }

    public double exponentation(double userInput, double userInput2) {
        return Math.pow(userInput, userInput2);
    }

    public double inverse(double userInput) {
        return 1/userInput;
    }
    public double invert(double userInput){
        return -userInput;
    }

}


