package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.util.Arrays;
public class ScienceCalc2 {

    public double sine(double input) {
        return Math.sin(input);
    }
    public double cosine(double input) {
        return Math.cos(input);
    }
    public double tangent(double input) {
        return Math.tan(input);
    }
    public double sineD(double input) {
        return Math.sin(Math.toRadians(input));
    }
    public double cosD(double input) {
        return Math.cos(Math.toRadians(input));
    }
    public double tanD(double input) {
        return Math.tan(Math.toRadians(input));
    }
    public double asin(double input) {
        return Math.asin(input);
    }
    public double acos(double input) {
        return Math.acos(input);
    }
    public double atan(double input) {
        return Math.atan(input);
    }
    public double asinD(double input) {
        return Math.toDegrees(Math.asin(input));
    }
    public double acosD(double input) {
        return Math.toDegrees(Math.acos(input));
    }
    public double atanD(double input) {
        return Math.toDegrees(Math.atan(input));
    }
    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public void calculator2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Trigonometric Units Mode");
        System.out.println("1. Radians");
        System.out.println("2. Degrees");
        System.out.println("3. Go Back");
        System.out.println("4. Factorial");
        System.out.println("5. Memory");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You've selected Radians");
                System.out.println("Please select Trigonometric Function");
                System.out.println("1. sin(x) 2. cos(x) 3. tan(x)");
                System.out.println("4. arcsin(x) 5. arccos(x) 6. arctan(x)");

                int input1 = scanner.nextInt();

                switch (input1) {
                    case 1:
                        System.out.println("Please enter your value");
                        System.out.println("sin(x)");
                        double input2 = scanner.nextDouble();
                        System.out.println(sine(input2));
                        calculator2();
                        break;
                    case 2:
                        System.out.println("Please enter your value");
                        System.out.println("cos(x)");
                        double input3 = scanner.nextDouble();
                        System.out.println(cosine(input3));
                        calculator2();
                        break;
                    case 3:
                        System.out.println("Please enter your value");
                        System.out.println("tan(x)");
                        double input4 = scanner.nextDouble();
                        System.out.println(tangent(input4));
                        calculator2();
                        break;
                    case 4:
                        System.out.println("Please enter your value");
                        System.out.println("arcsin(x)");
                        double input5 = scanner.nextDouble();
                        System.out.println(asin(input5));
                        calculator2();
                        break;
                    case 5:
                        System.out.println("Please enter your value");
                        System.out.println("arccos(x)");
                        double input6 = scanner.nextDouble();
                        System.out.println(acos(input6));
                        calculator2();
                        break;
                    case 6:
                        System.out.println("Please enter your value");
                        System.out.println("arctan(x)");
                        double input7 = scanner.nextDouble();
                        System.out.println(atan(input7));
                        calculator2();
                        break;
                    default:
                        System.out.println("Err");
                        calculator2();
                        break;
                }

            case 2:
                System.out.println("You've selected Degrees");
                System.out.println("Please select Trigonometric Function");
                System.out.println("1. sin(x) 2. cos(x) 3. tan(x)");
                System.out.println("4. arcsin(x) 5. arccos(x) 6. arctan(x)");

                int input2 = scanner.nextInt();

                switch (input2) {
                    case 1:
                        System.out.println("Please enter your value");
                        System.out.println("sin(x)");
                        double input3 = scanner.nextDouble();
                        System.out.println(sineD(input3));
                        calculator2();
                        break;
                    case 2:
                        System.out.println("Please enter your value");
                        System.out.println("cos(x)");
                        double input4 = scanner.nextDouble();
                        System.out.println(cosD(input4));
                        calculator2();
                        break;
                    case 3:
                        System.out.println("Please enter your value");
                        System.out.println("tan(x)");
                        double input5 = scanner.nextDouble();
                        System.out.println(tanD(input5));
                        calculator2();
                        break;
                    case 4:
                        System.out.println("Please enter your value");
                        System.out.println("arcsin(x)");
                        double input6 = scanner.nextDouble();
                        System.out.println(asinD(input6));
                        calculator2();
                        break;
                    case 5:
                        System.out.println("Please enter your value");
                        System.out.println("arccos(x)");
                        double input7 = scanner.nextDouble();
                        System.out.println(acosD(input7));
                        calculator2();
                        break;
                    case 6:
                        System.out.println("Please enter your value");
                        System.out.println("arctan(x)");
                        double input8 = scanner.nextDouble();
                        System.out.println(atanD(input8));
                        calculator2();
                        break;
                    default:
                        System.out.println("Err");
                        calculator2();
                        break;
                }

            case 3:
                calculator2();
                break;

            case 4:
                System.out.println("You've selected Factorial");
                System.out.println("Please enter your value");

                int input3 = scanner.nextInt();

                System.out.println(factorial(input3));
                calculator2();
                break;

            case 5:
                System.out.println("You are in Memory");
                System.out.println("1. M+ 2. MC 3. MRC 4. Go Back");

                int input4 = scanner.nextInt();

                switch (input4) {
                    case 1:
                        int input9 = scanner.nextInt();

                        int[] memory = new int[1];

                        System.out.println(Arrays.toString(memory));

                        for (int i = 0; i < memory.length; i++) {
                            memory[i] = input9;
                        }

                        System.out.println(Arrays.toString(memory));
                        calculator2();
                        break;

                    /*case 2:
                        System.out.println(Arrays.toString(memory));
                        System.out.println("Memory was reset");
                        memory[1] = 0:
                        System.out.println(Arrays.toString(memory));
                        calculator2();
                        break;*/

                }





        }
    }























}
