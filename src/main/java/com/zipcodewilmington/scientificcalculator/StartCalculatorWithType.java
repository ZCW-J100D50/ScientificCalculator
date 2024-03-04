package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class StartCalculatorWithType {

    static SimpleCalculator sm = new SimpleCalculator();
    static ScientificCalculator sf = new ScientificCalculator();
    public static void start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose a calculator type:");
        System.out.println("Please enter 1 for Simple calculator");
        System.out.println("Please enter 2 for Scientific calculator");

        int num = scan.nextInt();

        if(num==1){

            System.out.println("Please enter operator");
            System.out.println("" +
                    "addition(+) " +
                    "subtraction(-) " +
                    "division(/) " +
                    "multiplication(*) " +
                    "modulus(%) ");

            char ch = scan.next().charAt(0);
            System.out.println("Please enter first number");
            double dub1 = scan.nextDouble();
            System.out.println("Please enter second number");
            double dub2 = scan.nextDouble();
            System.out.println("Result "+ sm.calculator(ch,dub1,dub2));
        }

        else {
            System.out.println("You entered scientific calculator");
            System.out.println("Please enter value");
            double value = scan.nextDouble();
            System.out.println("Please choose calculation method");
            System.out.println("" +
                    "1-square, " +
                    "2-squareRoot, " +
                    "3-inverse, " +
                    "4-switchSign " +
                    "5-sine " +
                    "6-cosine " +
                    "7-tangent " +
                    "8-inverseSine " +
                    "9-inverseCosine " +
                    "10-inverseTangent " +
                    "11-factorial ");
            int a = scan.nextInt();

            switch (a){
                case 1:
                    System.out.println("Result: "+sf.square(value));
                    break;
                case 2:
                    System.out.println("Result: "+sf.squareRoot(value));
                    break;
                case 3:
                    System.out.println("Result: "+sf.inverse(value));
                    break;
                case 4:
                    System.out.println("Result "+sf.switchSign(value));

                    break;
                case 5:
                    System.out.println("Result " + sf.sine(value));
                    break;
                case 6:
                    System.out.println("Result "+sf.cosine(value));
                    break;
                case 7:
                    System.out.println("Result "+sf.tangent(value));
                    break;
                case 8:
                    System.out.println("Result "+sf.inverseSine(value));
                    break;
                case 9:
                    System.out.println("Result "+sf.inverseCosine(value));
                    break;
                case 10:
                    System.out.println("Result "+sf.inverseTangent(value));
                    break;
                case 11:
                    System.out.println("Result "+sf.factorial(value));

            }
        }




    }


}
