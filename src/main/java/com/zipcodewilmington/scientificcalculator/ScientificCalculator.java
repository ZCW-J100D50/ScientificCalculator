package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScientificCalculator {

    public static double displayNum = 0;
    public static void main(String[] args) {

        String calculation;
        Scanner scanner = new Scanner(System.in);

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
                    displayNum += scanner.nextDouble();
                    break;

                case "2":
                    System.out.println("Enter Number: ");
                    displayNum -= scanner.nextDouble();
                    break;

                case "3":
                    System.out.println("Enter Number: ");
                    displayNum *= scanner.nextDouble();
                    break;

                case "4":
                    System.out.println("Enter Number: ");
                    double error = scanner.nextDouble();
                    if (error != 0) {
                        displayNum /= error;
                    } else {
                        System.out.println("Err: Cannot divide a number by 0.\n");
                        displayNum = Double.NaN;
                    }
                    break;

                case "5":
                    displayNum = Math.pow(displayNum, 2);
                    break;

                case "6":

                    if (displayNum >= 0) {
                        displayNum = Math.sqrt(displayNum);
                    } else{
                        System.out.println("Err: user cannot take the square root of a negative number.");
                        displayNum = Double.NaN;
                    }
                    break;

                case "7":
                    System.out.println("Enter Exponent: ");
                    double exponent = scanner.nextDouble();
                    displayNum = Math.pow(displayNum, exponent);
                    break;

                case "8":
                    if (displayNum != 0) {
                        displayNum = 1 / displayNum;
                    } else {
                        System.out.println("Err: user cannot take the inverse of 0.");
                        displayNum = Double.NaN;
                    }
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

                    /*double result;
                    double num1, num2;*/

                        /*case "1":
                    /*System.out.println("\nYou have chosen addition!\nEnter First Number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter Second Number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    displayNum = result;

                    System.out.printf("%2.0f +%2.0f = %2.0f\n\n", num1, num2, result);


                            case "2":
                    System.out.println("\nYou have chosen Subtraction!\nEnter First Number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter Second Number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    displayNum = result;

                    System.out.printf("%2.0f - %2.0f = %2.0f\n", num1, num2, result);


                            case "3":
                    System.out.println("\nYou have chosen Multiplication!\nEnter First Number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter Second Number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    displayNum = result;

                    System.out.printf("%2.0f * %2.0f = %2.0f\n", num1, num2, result);


                            case "4":
                    System.out.println("\nYou have chosen Division!\nEnter First Number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter Second Number: ");
                    num2 = scanner.nextDouble();
                    if(num2 == 0){
                        System.out.println("Err: Cannot divide a number by 0.\n");
                        continue;
                    }
                    result = num1 / num2;
                    displayNum = result;

                    System.out.printf("%2.0f / %2.0f = %2.0f\n", num1, num2, result);



                            case "5":
                    System.out.println("\nYou have chosen Square Root!\nEnter the Base Number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter the Exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    displayNum = result;

                    System.out.printf("%2.0f^%2.0f = %2.0f\n", num1, num2, result);



                            case "6":
                    System.out.println("\nYou have chosen Square Root!\nEnter First Number: ");
                    num1 = scanner.nextDouble();
                    if(num1 < 0){
                        System.out.println("Err: user cannot take the square root of a negative number.\n");
                        continue;
                    }
                    result = Math.sqrt(num1);
                    displayNum = result;

                    System.out.printf("%2.0f = %2.0f\n", num1, result);*/

