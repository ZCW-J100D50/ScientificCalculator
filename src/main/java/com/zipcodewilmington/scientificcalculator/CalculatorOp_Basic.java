package com.zipcodewilmington.scientificcalculator;

public class CalculatorOp_Basic
{
    public Double addition(double writeDouble, double userInput2)
   {
        return writeDouble + userInput2;
    }
    public Double subtraction(double userInput, double userInput2)
    {
        return userInput - userInput2;
    }
    public Double multiplication(double userInput, double userInput2)
    {
        return userInput * userInput2;
    }
    public Double division(double userInput, double userInput2)
    {
        return userInput / userInput2;
    }
    public Double square(double userInput)
    {
        return userInput *= userInput;
    }
    public Double squareroot(double userInput)
    {
        if (userInput < 0){
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return Math.sqrt(userInput);
    }
    public Double exponential(double userInput, double userInput2)
    {
        return Math.pow(userInput,userInput2);
    }
    public Double inverse(double userInput)
    {
        return 1.0 / userInput;
    }
    public Double invertSign(double userInput){return -userInput;}
}