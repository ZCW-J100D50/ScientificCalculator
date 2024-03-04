package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Double getDoubleInput(String prompt)
    {
        println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }



}
