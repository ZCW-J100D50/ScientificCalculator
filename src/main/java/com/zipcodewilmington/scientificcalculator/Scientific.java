package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class Scientific {

    private String mode = "";
    //private double userInput = scannerMethod();  /// Not sure how to have a scanner obj for all methods yet

    private double memory = 0; //Will store whatever value
    // To clear memory it will set the value to null or zero?? maybe

    /*
    * MAYBE THE MAIN SHOULD HAVE A MENU SAYING DO YOU WANT TO DO ADDITION, SUBTRACTION ETC.
    * OR PRESS 99 TO ENTER SCIENTIFIC MODE
    *
    * THEN HAVE A MENU THAT SAYS DO YOU WANT TO DO TRIG FUNCTIONS, CONVERSIONS, LOG FUNCTIONS ETC.
    *
    * MAKE SURE INSIDE THE TRIG FUNCTIONS MENU I SET UP THE **SWITCH TRIG UNITS MODE(DEGREES, RADIANS)**
    *
    * DON'T FORGET TO ADD **AT LEAST** TWO OF MY OWN FEATURES
    *
    * */





    public void switchDisplayMode()
    {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Make your choice!");
        System.out.println("Enter '1': BINARY");
        System.out.println("Enter '2': OCTAL");
        System.out.println("Enter '3': DECIMAL");
        System.out.println("Enter '4': HEXADECIMAL");

        int numberChoice = scanner.nextInt();
        switch(numberChoice){
            case 1:
                this.mode = "Binary";
                break;
                // Binary system: where there are only two possible values for each digit, zero or one
            case 2:
                this.mode = "Octal";
                break;
                // Octal system: the value of each place is based on the powers of 8
            case 3:
                this.mode = "Decimal";
                break;
                // Decimal system: based on base 10 and the place values are based on the powers of 10
            case 4:
                this.mode = "Hexadecimal";
                break;
                // Hexadecimal system: the value of each place is based on the powers of 16
        }
        System.out.println("Display Mode Switching To: " + mode);
        scanner.close();
        switchDisplayMode(mode);
    }

    public void switchDisplayMode(String inMode)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();

        if(inMode.equals("Binary"))
        {
            //convertToBinary();
        } else if (inMode.equals("Octal"))
        {
            //convertToOctal();
        } else if (inMode.equals("Hexadecimal"))
        {
            //convertToHexadecimal();
        } else if (inMode.equals("Decimal"))
        {
            //convertToDecimal();
        }
        scanner.close();
    } // I might need methods for all these so i can have proper inputs to get code to work

    /*******************************Scientific Features Follows************************************** */

    public String convertToBinary(int userInput)
    {
        return Integer.toBinaryString(userInput);
    }

    public String convertToOctal(int userInput)
    {
        return Integer.toOctalString(userInput);
    }

    public String convertToHexadecimal(int userInput)
    {
        return Integer.toHexString(userInput);
    }

    public String convertToDecimal(int userInput)
    {
        return Integer.toString(userInput);
    }

    public double sineValue(double userInput)
    {
        userInput = Math.toRadians(userInput);
        return Math.sin(userInput);
    }

    public double cosineValue(double userInput)
    {
        userInput = Math.toRadians(userInput);
        return Math.cos(userInput);
    }

    public double tangentValue(double userInput)
    {
        userInput = Math.toRadians(userInput);
        return Math.tan(userInput);
    }

    public double inverseSineValue(double userInput)
    {
        userInput = Math.toRadians(userInput);
        return Math.asin(userInput);
    }

    public double inverseCosineValue(double userInput)
    {
        userInput = Math.toRadians(userInput);
        return Math.acos(userInput);
    }

    public double inverseTangentValue(double userInput)
    {
        userInput = Math.toRadians(userInput);
        return Math.atan(userInput);
    }

    public double logarithm(double userInput)
    {
        return Math.log10(userInput);
    } // TEST ALL LOG STUFF

    public double inverseLogarithm(double userInput)
    {
        return Math.pow(10,userInput);
    } // TEST ALL LOG STUFF

    public double naturalLogarithm(double userInput)
    {
        return Math.log(userInput);
    }

    public double inverseNaturalLogarithm(double userInput)
    {
        return Math.exp(userInput);
    }

    public long factorial(int userInput)
    {
        long temp = 1;
        for (int i = 2; i <= userInput; i++){
            temp *= i;
        }
        return temp;
    }

    public void switchUnitsMode()
    {} //Not coded yet

    public void switchUnitsMode(String mode)
    {} // Not coded yet


}











