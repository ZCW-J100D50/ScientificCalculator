package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
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
        return 1 / userInput;
    }

    public double invert(double userInput) {
        return -userInput;
    }
 public void calculator() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Team Archimedes calculator");
        System.out.println("Please select an operator");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. squared");
        System.out.println("6. SquareRoot");
        System.out.println("7. math.Pow");
        System.out.println("8. Inverse");
        System.out.println("9. Invert");
        System.out.println("11. Power Off");

        int choice = scanner.nextInt();

        if (choice == 11){
            System.out.println("Powering Off Bye Bye");
        }

        switch (choice) {
            case 1:
                System.out.println("Please input first value");
                double input1 = scanner.nextDouble();
                System.out.println("Please input second value");
                double input2 = scanner.nextDouble();
                System.out.println(addition(input1, input2));
                calculator();
                break;

            case 2:
                System.out.println("Please input first value");
                double input3 = scanner.nextDouble();
                System.out.println("Please input second value");
                double input4 = scanner.nextDouble();
                System.out.println(subtraction(input3, input4));
                calculator();
                break;

            case 3:
                System.out.println("Please input first value");
                double input5 = scanner.nextDouble();
                System.out.println("Please input second value");
                double input6 = scanner.nextDouble();
                System.out.println(multiplication(input5, input6));
                calculator();
                break;

            case 4:
                System.out.println("Please input first value");
                double input7 = scanner.nextDouble();
                System.out.println("Please input second value");
                double input8 = scanner.nextDouble();
                if (input8 ==0) {
                    System.out.println("ERR");
                } else {
                    System.out.println(division(input7, input8));
                }
                calculator();
                break;

                case 5:
                System.out.println("Please input value");
                double input9 = scanner.nextDouble();
                System.out.println(square(input9));
                calculator();
                break;

            case 6:
                System.out.println("Please input value");
                double input10 = scanner.nextDouble();
                System.out.println(squareRoot(input10));
                calculator();
                break;

            case 7:
                System.out.println("Please input first value");
                double input11 = scanner.nextDouble();
                System.out.println("Please input second value");
                double input12 = scanner.nextDouble();
                System.out.println(exponentation(input11, input12));
                calculator();
                break;

            case 8:
                System.out.println("Please input value");
                double input13 = scanner.nextDouble();
                System.out.println(inverse(input13));
                calculator();
                break;

            case 9:
                System.out.println("Please input value");
                double input14 = scanner.nextDouble();
                System.out.println(invert(input14));
                calculator();
                break;






        }


 }





}




