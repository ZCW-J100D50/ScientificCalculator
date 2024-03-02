package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        // commenting thse out for now
       Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s a3
//        2s a integer", i);
//        Console.println("The user input %s as a d", d);
        Scanner scanner = new Scanner(System.in);

        Core calculator = new Core();

        // Perform calculation
        calculator.askOperator(scanner);

//        System.out.println("Add: " + calculator.getAdd());
//        System.out.println("Subtract: " + calculator.getSubtract());
//        System.out.println("Multiplication: " + calculator.getMultiplication());
//        System.out.println("Division: " + calculator.getDivision());
        System.out.println(calculator.getResult());



    }
}
