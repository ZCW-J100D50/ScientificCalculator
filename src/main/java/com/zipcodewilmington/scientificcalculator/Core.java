//package com.zipcodewilmington.scientificcalculator;
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//public class Core {
//    // Instance variables to store values
//    private double result;
//
//
//    //need Constructor to initialize instance variables
//    public Core() {
//        this.result = 0;
//    }
//
//    Core2 core2 = new Core2();
//
//    // getters and setters for the scientific class to use because its our instance variables are private
//    public double getResult(){
//        return result;
//    }
//
//    //Method to ask user which operation to use
//    public void askOperator(Scanner scanner) {
//
//        System.out.println("Choose what operator to use");
//        System.out.println("1. Add");
//        System.out.println("2. Subtract");
//        System.out.println("3. Multiplication");
//        System.out.println("4. Division");
//        System.out.println("5. Square");
//        System.out.println("6. Square Root");
//        System.out.println("7. Exponentiation");
//        System.out.println("8. Invert");
//
//        int choice =scanner.nextInt();
//
//
//
//
//
//
//        // use a swtich case based on choice
//        switch (choice) {
//            case 1:
//                System.out.println("Please enter first value:");
//                double d1 = scanner.nextDouble();
//                System.out.println("Please enter second value:");
//                double d2 = scanner.nextDouble();
//                System.out.print("Result "+core2.addition(d1,d2));
//                break;
//            case 2:
//                System.out.println("Please enter first value");
//                double d3 = scanner.nextDouble();
//                System.out.println("please enter second value");
//                double d4 = scanner.nextDouble();
//                System.out.print("Result ");
//                result = d3 - d4;
//                break;
//            case 3:
//                System.out.println("Please enter first value");
//                double d5 = scanner.nextDouble();
//                System.out.println("Please enter second value");
//                double d6 = scanner.nextDouble();
//                System.out.print("result ");
//                result = d5 * d6;
//                break;
//            case 4:
//                System.out.print("values to divide");
//                result =  scanner.nextDouble() / scanner.nextDouble();
//                break;
//            case 5:
//                System.out.print("Squaring");
//                result = scanner.nextDouble();
//                    result *= result;
//            case 6:
//                System.out.print("Square Root");
//                result = scanner.nextDouble();
//                    result = Math.sqrt(result);
//            case 7:
//                System.out.print("Exponentitation");
//                result = scanner.nextDouble();
//                    result = 1/result;
//            case 8:
//                System.out.print("Invert");
//                result = scanner.nextDouble();
//                    result *= -1;
//
//
//            default:
//                System.out.println("invalid input");
//        }
//    }
//
//}


