package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
public class ScientificCalculator {

    public static double displayNum = 0;
    public static void main(String[] args) {

        String calculation;
        Scanner scanner = new Scanner(System.in);
        CoreCalculations cal = new CoreCalculations();
        Trigonometry trig = new Trigonometry();
        LogarithmicFunctions log = new LogarithmicFunctions();

        System.out.println("Welcome to my calculator!\n");

        while (true) {
            System.out.printf("List of Operations:\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Square\n 6. Square Root\n 7. Exponent\n 8. Inverse\n 9. Switch\n " +
                    "10. sin\n 11. cos\n 12. tan\n 13. inverseSin\n 14. inverseCos\n 15. inverseTan\n " +
                    "16. log\n 17. log-1\n 18. ln\n 19. clear\n Type {exit} to End Program.\n\nYour current value: %2.1f\n\nPlease Choose an Operation:\n", displayNum);
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
                    System.out.println("Enter Number: ");
                    displayNum = cal.square(displayNum);
                    break;

                case "6":
                    System.out.println("Enter Number: ");
                    displayNum = cal.squareRoot(displayNum);
                    break;

                case "7":
                    System.out.println("Enter Exponent: ");
                    double exponent = scanner.nextDouble();
                    displayNum = cal.exponent(displayNum, exponent);
                    break;

                case "8":
                    System.out.println("Enter Number: ");
                    displayNum = cal.inverse(displayNum);
                    break;

                case "9":
                    System.out.println("Enter Number: ");
                    displayNum = -displayNum;
                    break;

                case "10"  :
                    System.out.println("Enter Number: ");
                    displayNum = trig.calculateSine(displayNum);
                    break;
                case "11"  :
                    System.out.println("Enter Number: ");
                    displayNum = trig.calculateCosine(displayNum);
                    break;
                case "12":
                    System.out.println("Enter Number: ");
                    displayNum = trig.calculateTangent(displayNum);
                    break;
                case "13":
                    System.out.println("Enter Number: ");
                    displayNum = trig.calculateInverseSine(displayNum);
                    break;
                case "14":
                    System.out.println("Enter Number: ");
                    displayNum = trig.calculateInverseCosine(displayNum);
                    break;
                case "15":
                    System.out.println("Enter Number: ");
                    displayNum = trig.calculateInverseTangent(displayNum);
                    break;
                case "16":
                    System.out.println("Enter Number: ");
                    displayNum = log.calculateLogarithmic(displayNum);
                    break;
                case "17":
                    System.out.println("Enter Number: ");
                    displayNum = log.calculateInverseLogarithm(displayNum);
                    break;
                case "18":
                    System.out.println("Enter value: ");
                    double base = scanner.nextDouble();
                    System.out.println("Enter base: ");
                    displayNum = log.calculateNaturalLog(displayNum, base);
                    break;
                case "19":
                    displayNum = 0;
                    break;

            }
        }
    }
}