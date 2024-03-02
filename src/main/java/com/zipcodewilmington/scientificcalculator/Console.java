package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void defaultValue (){
        System.out.println(SimpleCalculator.intResult);
    }


    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    public static Double getDoubleInput(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        return d;
    }


}
