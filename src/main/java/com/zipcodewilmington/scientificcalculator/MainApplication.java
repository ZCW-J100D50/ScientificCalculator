package com.zipcodewilmington.scientificcalculator;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//         Console.println("The user input %s as a d", d);

        Calculator calculator = new Calculator();
        Console.println("\n%s\n", calculator.getCurrentValue());
        int userInput;
        while(true){

            Console.println("1.) Clear Display");
            Console.println("2.) Change Current Value");
            Console.println("3.) Addition");
            Console.println("4.) Subtraction");
            Console.println("5.) Multiplication");
            Console.println("6.) Division");
            Console.println("7.) Square");
            Console.println("8.) Square Root");
            Console.println("9.) Exponential");
            Console.println("10.) Inverse");
            Console.println("11.) Invert Signs");

            // other operations
            Console.println("12.) Exit");
            userInput = Console.getIntegerInput("Please select from the following options: ");
            switch (userInput){
                case 1:
                    // case for Clear screen
                    calculator.setCurrentValue(0);
                    //Console.println("\n%s\n", calculator.getCurrentValue());
                    break;
                case 2:
                    // Change current value
                    double newValue = Console.getDoubleInput("Please enter new value: ");
                    calculator.setCurrentValue(newValue);
                    break;
                case 3:
                    // for addition
                    double number = Console.getDoubleInput("Enter a value to add: ");
                    calculator.add(number);
                    break;
                case 4:
                    // for subtraction
                    double number1 = Console.getDoubleInput("Enter a value to subtract: ");
                    calculator.sub(number1);
                    break;
                case 5:
                    // for multiplication
                    double number2 = Console.getDoubleInput("Enter a value to multiply: ");
                    calculator.multiply(number2);
                    break;
                case 6:
                    // for division
                    double number3 = Console.getDoubleInput("Enter a value to divide: ");
                    calculator.divide(number3);
                    break;
                case 7:
                    // to find square of a number
                    double number4 = Console.getDoubleInput("Enter a value to do square: ");
                    calculator.square(number4);
                    break;
                case 8:
                    // for square root
                    double number5 = Console.getDoubleInput("Enter a value to do square root: ");
                    calculator.squareRoot(number5);
                    break;

                case 9:
                    // for exponential
                    double number6 = Console.getDoubleInput("Enter a value of exponent: ");
                    calculator.exponential(number6);
                    break;

                case 10:
                    // for inverse of a number
                   calculator.inverse();
                    break;
                case 11:
                    // for invert signs
                    calculator.invertSign();
                    break;

                case 12:
                    // to exit
                    System.exit(0);
                default:
                    Console.println("Invalid entry try again");

        }
        Console.println("\n%s\n", calculator.getCurrentValue());


        }
    }
}
