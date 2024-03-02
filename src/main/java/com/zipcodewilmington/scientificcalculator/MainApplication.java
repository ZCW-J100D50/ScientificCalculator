package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    static Scientific scientific = new Scientific();
    public static void main(String[] args)
    {
        Console.println("\t\tWelcome to my calculator!");
        menu();
    }

    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Menu: ");
            System.out.println("1. Simple Calculations");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    simpleCalcMenu();
                case 2:
                    scientificCalculationsMenu();
                case 3:
                    //
            }

        }while(choice != 3);
        scanner.close();
    }

    private static void scientificCalculationsMenu()
    {

    }

    private static void simpleCalcMenu()
    {
        Scanner  scanner = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Simple Calculations Menu: ");
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

            switch(choice)
            {
                case 1:
                    // addMethod() //use scannerMethod()for each input
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice != 10);
        scanner.close();

    }

    public static double scannerMethod()
    {
        System.out.println("Enter a value: ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        return value;
    }
    

}
