package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScienceCalc {
    double sine;
    private double cosine;
    private double tangent;
    private double sineDeg;
    private double cosineDeg;
    private double tangentDeg;

    // Constructor to initialize variables at zero
    public ScienceCalc() {
        this.sine = 0;
        this.cosine = 0;
        this.tangent = 0;
        this.sineDeg = 0;
        this.cosineDeg = 0;
        this.tangentDeg = 0;
    }

    // Getters and setters to access my private instance variables
    public double getSine() {
        return sine;
    }

    public double getCosine() {
        return cosine;
    }

    public double getTangent() {
        return tangent;
    }

    public double getSineDeg() {
        return sineDeg;
    }

    public double getCosineDeg() {
        return cosineDeg;
    }

    public double getTangentDeg() {
        return tangentDeg;
    }

    public void askOperator1(Scanner scanner) {
        // asking user for trig units mode
        System.out.println("Enter units mode");
        System.out.println("1. radians, 2. degrees");
        int userInput1 = scanner.nextInt();

        switch (userInput1) {
            case 1:
                System.out.println("radians");
                break;
            case 2:
                System.out.println("degrees");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        // asking user for trig function
        System.out.println("Enter trig function");
        System.out.println("1. sine, 2. cosine, 3. tangent");
        int userInput2 = scanner.nextInt();

        switch (userInput2) {
            case 1:
                System.out.println("sine");
                break;
            case 2:
                System.out.println("cosine");
                break;
            case 3:
                System.out.println("tangent");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        // asking user for numerical input to calculate
        System.out.println("Enter number to calculate");
        double userInput3 = scanner.nextDouble();

        if (userInput1 == 1 && userInput2 == 1) {
            sine = Math.sin(userInput3);
            System.out.println(sine);

        } else if (userInput1 == 1 && userInput2 == 2) {
            cosine = Math.cos(userInput3);
            System.out.println(cosine);

        } else if (userInput1 == 1 && userInput2 == 3) {
            tangent = Math.tan(userInput3);
            System.out.println(tangent);

        } else if (userInput1 == 2 && userInput2 == 1) {
            sineDeg = Math.sin(Math.toRadians(userInput3));
            System.out.println(sineDeg);

        } else if (userInput1 == 2 && userInput2 == 2) {
            cosineDeg = Math.cos(Math.toRadians(userInput3));
            System.out.println(cosineDeg);

        } else if (userInput1 == 2 && userInput2 == 3) {
            tangentDeg = Math.tan(Math.toRadians(userInput3));
            System.out.println(tangentDeg);

        } else {
            System.out.println("ERROR");
        }
    }
}