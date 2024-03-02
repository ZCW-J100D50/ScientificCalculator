package com.zipcodewilmington.scientificcalculator;

public class CalculatorOp_Basic
{
    public void CalculatorOp_Basic(double firstNumber, double secondNumber, String operation)
    {
        double return;
        if (operation.equals("+"))
        {
            return = firstNumber + secondNumber;
            System.out.println("Result of " + firstNumber + " + " + secondNumber + " = " + return);
        }
        else if (operation.equals("-"))
        {
            return; = firstNumber - secondNumber;
            System.out.println("Result of " + firstNumber + " - " + secondNumber + " = " + return);
        }
        else if (operation.equals("*"))
        {
            return; = firstNumber * secondNumber;
            System.out.println("Result of " + firstNumber + " * " + secondNumber + " = " + return);
        }
        else if (operation.equals("/")) {
            if (secondNumber != 0) {
                return; = firstNumber / secondNumber;
                System.out.println("Result of " + firstNumber + " / " + secondNumber + " = " + return);
            } else {
                System.out.println("Err");
            }
        }
        else if (operation.equalsIgnoreCase("sq"))
        {
            return; = Math.pow(firstNumber, 2);
            System.out.println("Result of " + firstNumber + " square = " + return);

        }
        else if (operation.equalsIgnoreCase("sqrt"))
        {
            return = Math.sqrt(firstNumber);
            System.out.println("Result of " + firstNumber + " squareroot = " + return);

        }
        else if (operation.equalsIgnoreCase("exp"))
        {
            return = Math.pow(firstNumber, secondNumber);
            System.out.println("Result of " + firstNumber + " exponential of " + secondNumber + " = " + return);
        }
        else if (operation.equalsIgnoreCase("inv"))
        {
            return = 1/firstNumber;
            System.out.println("Result of inverse of " + firstNumber + " = " + return);
        }
        //return result;
    }

   public Double addition(double userInput, double userInput2)
   {
        return userInput + userInput2;
    }

    public Double subtraction(double userInput, double userInput2)
    {
        return userInput - userInput2;
    }
    public Double multiplication(double userInput, double userInput2)
    {
        return userInput - userInput2;
    }
    public Double division(double userInput, double userInput2)
    {
        return userInput - userInput2;
    }
    public Double square(double userInput, double userInput2)
    {
        return userInput - userInput2;
    }
    public Double squareroot(double userInput, double userInput2)
    {
        return userInput - userInput2;
    }
    public Double exponential(double userInput, double userInput2)
    {
        return userInput - userInput2;
    }
    public Double inverse(double userInput, double userInput2)
    {
        return userInput - userInput2;
    }
}