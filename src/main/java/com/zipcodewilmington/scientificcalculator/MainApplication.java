package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


        static Scientific sci = new Scientific();
        static CalculatorOp_Basic cb = new CalculatorOp_Basic();

        public static void main(String[] args)
        {
            Console.println("\t\tWelcome to Hypatia calculator!");
            menu();
        }

        public static void menu ()
        {
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("Menu: ");
                System.out.println("1. Simple Calculations");
                System.out.println("2. Scientific Calculations");
                System.out.println("3. Exit");
                System.out.println("Enter your choice: ");

                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        simpleCalcMenu();
                        break;
                    case 2:
                        scientificCalculationsMenu();
                        break;
                    case 3:
                        System.out.println("\n\nTHANK YOU!");
                        System.exit(0);
                        break;
                }

            } while (choice != 3);
        }

        private static void scientificCalculationsMenu ()
        {
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("\t\tScientific Calculations Menu: ");
                System.out.println("1. Convert Decimal to Binary");
                System.out.println("2. Convert Decimal to Octal");
                System.out.println("3. Convert Decimal to Hexadecimal");
                System.out.println("4. Convert Decimal to Decimal");
                System.out.println("5. Sine");
                System.out.println("6. Cosine");
                System.out.println("7. Tangent");
                System.out.println("8. Inverse Sine");
                System.out.println("9. Inverse Cosine");
                System.out.println("10. Inverse TangentValue");
                System.out.println("11. Logarithm");
                System.out.println("12. Inverse Logarithm");
                System.out.println("13. Natural Logarithm");
                System.out.println("14. Inverse Natural Logarithm");
                System.out.println("15. Factorial");
                System.out.println("16. Switch Between Degrees and Radians");
                System.out.println("17. Go Back");
                System.out.println("Enter your choice: ");

                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter an Integer: ");
                        int userInput = scanner.nextInt();
                        System.out.println("\nResult: "+sci.convertToBinary(userInput));
                        break;
                    case 2:
                        System.out.println("Enter an Integer: ");
                        int userInput2 = scanner.nextInt();;
                        System.out.println("\nResult: "+sci.convertToOctal(userInput2));
                        break;
                    case 3:
                        System.out.println("Enter an Integer: ");
                        int userInput3 = scanner.nextInt();;
                        System.out.println("\nResult: "+sci.convertToHexadecimal(userInput3));
                        break;
                    case 4:
                        System.out.println("Enter an Integer: ");
                        int userInput4 = scanner.nextInt();;
                        System.out.println("\nResult: "+sci.convertToDecimal(userInput4));
                        break;
                    case 5:
                        System.out.println("Enter number: ");
                        double userInput5 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.sineValue(userInput5));
                        break;
                    case 6:
                        System.out.println("Enter number: ");
                        double userInput6 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.cosineValue(userInput6));
                        break;
                    case 7:
                        System.out.println("Enter number: ");
                        double userInput7 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.tangentValue(userInput7));
                        break;
                    case 8:
                        System.out.println("Enter number: ");
                        double userInput8 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.inverseSineValue(userInput8));
                        break;
                    case 9:
                        System.out.println("Enter number: ");
                        double userInput9 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.inverseCosineValue(userInput9));
                        break;
                    case 10:
                        System.out.println("Enter number: ");
                        double userInput10 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.inverseTangentValue(userInput10));
                        break;
                    case 11:
                        System.out.println("Enter number: ");
                        double userInput11 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.logarithm(userInput11));
                        break;
                    case 12:
                        System.out.println("Enter number: ");
                        double userInput12 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.inverseLogarithm(userInput12));
                        break;
                    case 13:
                        System.out.println("Enter number: ");
                        double userInput13 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.naturalLogarithm(userInput13));
                        break;
                    case 14:
                        System.out.println("Enter number: ");
                        double userInput14 = scanner.nextDouble();
                        System.out.println("\nResult: "+sci.inverseNaturalLogarithm(userInput14));
                        break;
                    case 15:
                        System.out.println("Enter an Integer: ");
                        int userInput15 = scanner.nextInt();;
                        System.out.println("\nResult: "+sci.factorial(userInput15));
                        break;
                    case 16:
                        sci.switchUnitsMode();
                        break;
                    case 17:
                        System.out.println("\nGoing back to main menu...\n");
                        break;
                    default:
                        System.out.println("\t***Invalid choice. Please try again.***");
                }
            }while(choice != 17);
        }

        private static void simpleCalcMenu ()
        {
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("\t\tSimple Calculations Menu: ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Division");
                System.out.println("4. Multiplication");
                System.out.println("5. Square");
                System.out.println("6. Square Root");
                System.out.println("7. Exponentiation");
                System.out.println("8. Inverse");
                System.out.println("9. Invert Sign");
                System.out.println("10. Go Back");
                System.out.println("Enter your choice: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter first number: ");
                        double userInput = scanner.nextDouble();
                        System.out.println("Enter second number: ");
                        double userInput2 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.addition(userInput, userInput2));
                        break;
                    case 2:
                        System.out.println("Enter first number: ");
                        double userInput3 = scanner.nextDouble();
                        System.out.println("Enter second number: ");
                        double userInput4 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.subtraction(userInput3, userInput4));
                        break;
                    case 3:
                        System.out.println("Enter first number: ");
                        double userInput5 = scanner.nextDouble();
                        System.out.println("Enter second number: ");
                        double userInput6 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.division(userInput5, userInput6));
                        break;
                    case 4:
                        System.out.println("Enter first number: ");
                        double userInput7 = scanner.nextDouble();
                        System.out.println("Enter second number: ");
                        double userInput8 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.multiplication(userInput7, userInput8));
                        break;
                    case 5:
                        System.out.println("Enter number: ");
                        double userInput9 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.square(userInput9));
                        break;
                    case 6:
                        System.out.println("Enter number: ");
                        double userInput10 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.squareroot(userInput10));
                        break;
                    case 7:
                        System.out.println("Enter number: ");
                        double userInput11 = scanner.nextDouble();
                        System.out.println("To the power of: ");
                        double userInput12 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.exponential(userInput11,userInput12));
                        break;
                    case 8:
                        System.out.println("Enter number: ");
                        double userInput13 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.inverse(userInput13));
                        break;
                    case 9:
                        System.out.println("Enter number: ");
                        double userInput14 = scanner.nextDouble();
                        System.out.println("\nResult: "+cb.invertSign(userInput14));
                        break;
                    case 10:
                        System.out.println("\nGoing back to main menu...\n");
                        break;
                    default:
                        System.out.println("\t***Invalid choice. Please try again.***");
                }
            } while (choice != 10);


        }

}
