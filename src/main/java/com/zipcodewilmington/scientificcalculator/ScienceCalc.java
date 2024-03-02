package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScienceCalc {
    /*private double degrees;
    private double radians;
    private double angle;

    public ScienceCalc() {
        degrees = Math.toDegrees(Math.PI);
        radians = Math.toRadians(180.0);
        angle = degrees/ 180.0 * Math.PI;
    }*/

    public ScienceCalc(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. degrees, 2. radians");

        int num1 = scanner.nextInt();
        System.out.println("1. sine, 2. cosine, 3. tangent");

        //int num2 = scanner.nextInt();

        switch (num1) {
            case 1:
                System.out.println("degrees");
                break;
            case 2:
                System.out.println("radians");
                break;
            default:
                System.out.println("invalid input");

        }



    }


}


