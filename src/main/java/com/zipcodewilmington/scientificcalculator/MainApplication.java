package com.zipcodewilmington.scientificcalculator;

<<<<<<< HEAD
import java.sql.SQLOutput;
import java.util.Scanner;
=======
>>>>>>> 8d0843a57eb1393fa3e1a65d965c7574652f4703
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
<<<<<<< HEAD

        Console.println("Welcome to my calculator!");
        /*String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);*/

        Scanner scanner = new Scanner(System.in);

        /*Core calculator = new Core();

        // Perform calculation
        calculator.askOperator(scanner);

        System.out.println("Add: " + calculator.getAdd());
        System.out.println("Subtract: " + calculator.getSubtract());
        System.out.println("Multiplication: " + calculator.getMultiplication());
        System.out.println("Division: " + calculator.getDivision());*/
        // Commented this out to test my portion of the calculator - Anthony
=======
//        // commenting thse out for now
//       Console.println("Welcome to my calculator!");
////        String s = Console.getStringInput("Enter a string");
////        Integer i = Console.getIntegerInput("Enter an integer");
////        Double d = Console.getDoubleInput("Enter a double.");
////
////        Console.println("The user input %s as a string", s);
////        Console.println("The user input %s a3
////        2s a integer", i);
////        Console.println("The user input %s as a d", d);
//        Scanner scanner = new Scanner(System.in);
//
//        Core calculator = new Core();
//
//        // Perform calculation
//        calculator.askOperator(scanner);
//
//            Core2 core2 = new Core2();
//            core2.addition(value,value3);
////        System.out.println("Add: " + calculator.getAdd());
////        System.out.println("Subtract: " + calculator.getSubtract());
////        System.out.println("Multiplication: " + calculator.getMultiplication());
////        System.out.println("Division: " + calculator.getDivision());
//        System.out.println(calculator.getResult());
        new Core2().calculator();

//        System.out.println(c2.inverse(5));


>>>>>>> 8d0843a57eb1393fa3e1a65d965c7574652f4703

        // new calculator1 object to initialize the scientific calculators equations
        ScienceCalc calculator1 = new ScienceCalc();
        calculator1.askOperator1(scanner);

        System.out.println("sin: " + calculator1.getSine());
        System.out.println("cos: " + calculator1.getCosine());
        System.out.println("tan: " + calculator1.getTangent());
        System.out.println("sinD: " + calculator1.getSineDeg());
        System.out.println("cosD: " + calculator1.getCosineDeg());
        System.out.println("tanD: " + calculator1.getTangentDeg());
    }

}
