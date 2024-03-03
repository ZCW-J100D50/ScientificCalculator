package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
public class ScientificCalculator {

    public static double displayNum = 0;
    public static void main(String[] args) {

        String calculation;
        Scanner scanner = new Scanner(System.in);
        CoreCalculations cal = new CoreCalculations();

        System.out.println("Welcome to my calculator!\n");

        while (true) {
            System.out.printf("List of Operations:\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Square\n 6. Square Root\n 7. Exponent\n 8. Inverse\n 9. Switch\n 10. clear\n Type {exit} to End Program.\n\nYour current value: %2.1f\n\nPlease Choose an Operation:\n", displayNum);
            calculation = scanner.next();

            if (calculation.equalsIgnoreCase("exit")) {
                break;
            }

            switch (calculation) {
                case "1":
                    System.out.println("Enter Number: ");
                    displayNum = cal.addition(displayNum,scanner.nextDouble());
                    break;

                case "2":
                    System.out.println("Enter Number: ");
                    displayNum = cal.subtraction(displayNum, scanner.nextDouble());
                    break;

                case "3":
                    System.out.println("Enter Number: ");
                    displayNum = cal.multiplication(displayNum,scanner.nextDouble() );
                    break;

                case "4":
                    System.out.println("Enter Number: ");
                    displayNum = cal.division(displayNum, scanner.nextDouble());
                    break;

                case "5":
                    displayNum = cal.square(displayNum);
                    break;

                case "6":
                    displayNum = cal.squareRoot(displayNum);
                    break;

                case "7":
                    System.out.println("Enter Exponent: ");
                    double exponent = scanner.nextDouble();
                    displayNum = cal.exponent(displayNum, exponent);
                    break;

                case "8":
                    displayNum = cal.inverse(displayNum);
                    break;

                case "9":
                    displayNum = -displayNum;
                    break;

                case "10":
                    displayNum = 0;
                    break;

            }
        }
    }
}