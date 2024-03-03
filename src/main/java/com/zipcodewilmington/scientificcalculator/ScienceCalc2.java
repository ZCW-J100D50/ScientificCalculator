package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
public class ScienceCalc2 {

    public double sine(double userInput2) {
        return Math.sin(userInput2);
    }
    public double cosine(double userInput) {
        return Math.cos(userInput);
    }
    public double tangent(double userInput) {
        return Math.tan(userInput);
    }
    public double sineD(double userInput) {
        return Math.sin(Math.toRadians(userInput));
    }
    public double cosD(double userInput) {
        return Math.cos(Math.toRadians(userInput));
    }
    public double tanD(double userInput) {
        return Math.tan(Math.toRadians(userInput));
    }
    public double asin(double userInput) {
        return Math.asin(userInput);
    }
    public double acos(double userInput) {
        return Math.acos(userInput);
    }
    public double atan(double userInput) {
        return Math.atan(userInput);
    }
    public double asinD(double userInput) {
        return Math.asin(Math.toRadians(userInput));
    }
    public double acosD(double userInput) {
        return Math.acos(Math.toRadians(userInput));
    }
    public double atanD(double userInput) {
        return Math.atan(Math.toRadians(userInput));
    }

    public void calculator2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Trigonometric Function");
        System.out.println("1. sin(x) 2. cos(x) 3. tan(x)");
        int userInput = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        switch (userInput) {
            case 1:
                sine(userInput2);
                break;
            case 2:
                cosine(userInput2);
                break;
            case 3:
                tangent(userInput2);
                break;
            default:
                System.out.println("Error");
        }
    }























}
