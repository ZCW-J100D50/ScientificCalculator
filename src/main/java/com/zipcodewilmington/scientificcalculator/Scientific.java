package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class Scientific {

    private String mode = "";

    // --Commented out by Inspection (3/3/24, 11:46 AM):private double memory = 0; //Will store whatever value
    // To clear memory it will set the value to null or zero?? maybe

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
        switchDisplayMode(mode);
    }

    public void switchDisplayMode(String inMode)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();

        switch (inMode) {
            case "Binary":
                System.out.println(convertToBinary(input));
                break;
            case "Octal":
                System.out.println(convertToOctal(input));
                break;
            case "Hexadecimal":
                System.out.println(convertToHexadecimal(input));
                break;
            case "Decimal":
                System.out.println(convertToDecimal(input));
                break;
        }
    }

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
    }

    public double inverseLogarithm(double userInput)
    {
        return Math.pow(10,userInput);
    }

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
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Switch to Radians");
        System.out.println("2. Switch to Degrees");
        String choice = scanner.next();
        switchUnitsMode(choice);
    }

    public void switchUnitsMode(String mode)
    {
        Scanner scanner = new Scanner(System.in);
        if (mode.equals("1")) {
            System.out.println("Enter in Radians: ");
            double radians = scanner.nextDouble();
            System.out.println("Radians: "+radians+"\tDegrees: "+Math.toDegrees(radians));
        } else if (mode.equals("2")) {
            System.out.println("Enter in Degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("Degrees: " + degrees + "\tRadians: " + Math.toRadians(degrees));
        } else {
            System.out.println("\n\nNot a valid choice. Follow directions!\n\n");
        }
    }

    public double getPi(int numOfPlaces)
    {
        double factor = Math.pow(10, numOfPlaces);
        return Math.floor(Math.PI * factor) / factor;

    }

    public String randomNumbers(int choice)
    {
        double rand1 = Math.random();
        double rand2 = Math.random();
        // addition, sub, mult, divis
        switch (choice){
            case 1:
                double total = rand1 + rand2;
                return rand1 +" + "+rand2+" = "+total;
            case 2:
                double total2 = rand1 - rand2;
                return rand1 +" - "+rand2+" = "+total2;
            case 3:
                double total3 = rand1 * rand2;
                return rand1 +" * "+rand2+" = "+total3;
            case 4:
                double total4 = rand1 / rand2;
                return rand1 +" / "+rand2+" = "+total4;
            default:
                return "** hmm not sure **";
        }

    }

    // Yay coding!
}











