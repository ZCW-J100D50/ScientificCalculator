package com.zipcodewilmington.scientificcalculator;

public class SimpleCalculator {


    public static double doubleResult;
    public static int intResult;

    public SimpleCalculator(){
        this.intResult = 0;
    }


    public double calculator(char operator, double num1, double num2) {

        if (operator == '+') {
            if(num1<0){

            }
            doubleResult = num1 + num2;
        }


        else if (operator == '-') {
            if (num1 > num2) {
                doubleResult = num1 - num2;
            } else {
                doubleResult = -num2 -(- num1);
            }
        }
        else if (operator == '*') {
            if(num1<0 || num2<0){
                doubleResult = -num1 * num2;
            }
            else {
                doubleResult = num1 * num2;
            }

        }
        else if (operator == '%') {
            doubleResult = num1 % num2;
        }
        else {
            try {
                if (num1 > num2) {
                    doubleResult = num1 / num2;
                } else {
                    doubleResult = num2 / num1;
                }
            } catch (ArithmeticException e) {
                System.out.println("Exception handled " + e.getMessage());
            }

        }
        return doubleResult;
    }



    public double calculator(char operator, int num1, double num2) {
        if (operator == '+') {
            doubleResult = num1 + num2;
        } else if (operator == '-') {
            if (num1 > num2) {
                doubleResult = num1 - num2;
            } else {
                doubleResult = num2 - num1;
            }
        }
        else if (operator == '%') {
            doubleResult = num1 % num2;
        }
        else if (operator == '*') {
            doubleResult = num1 * num2;
        } else {
            try {
                if (num1 > num2) {
                    doubleResult = num1 / num2;
                } else {
                    doubleResult = num2 / num1;
                }
            } catch (ArithmeticException e) {
                System.out.println("Exception handled " + e.getMessage());
            }

        }
        return doubleResult;
    }

    public double calculator(char operator, double num1, int num2) {
        if (operator == '+') {
            doubleResult = num1 + num2;
        } else if (operator == '-') {
            if (num1 > num2) {
                doubleResult = num1 - num2;
            }
            else if (operator == '%') {
                doubleResult = num1 % num2;
            }
            else {
                doubleResult = num2 - num1;
            }
        } else if (operator == '*') {
            doubleResult = num1 * num2;
        } else {
            try {
                if (num1 > num2) {
                    doubleResult = num1 / num2;
                } else {
                    doubleResult = num2 / num1;
                }
            } catch (ArithmeticException e) {
                System.out.println("Exception handled " + e.getMessage());
            }

        }
        return doubleResult;
    }

    public double calculator(char operator, int num1, int num2) {
        if (operator == '+') {
            doubleResult = num1 + num2;
        } else if (operator == '-') {
            if (num1 > num2) {
                 doubleResult = num1 - num2;
            }
            else {
                 doubleResult = num2 - num1;
            }
        } else if (operator == '*') {
            doubleResult = num1 * num2;
        }

        else if (num1 > num2) {
            try{
                doubleResult = num1 / num2;
            }
            catch (ArithmeticException e){
                System.out.println("Exception handled "+e.getMessage());
            }


        }
        else if (num2 < num1) {
            try{
                doubleResult = num2 / num1;
            }
            catch (ArithmeticException e){
                System.out.println("Exception handled "+e.getMessage());
            }
        }

            return doubleResult;



    }
}
