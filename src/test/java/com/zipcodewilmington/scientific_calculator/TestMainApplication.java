package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorOp_Basic;
import com.zipcodewilmington.scientificcalculator.Scientific;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.lang.String;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {


    // Test the method for addition functionality
    @Test
    public void testAddition() {
        // Create a new instance of ScientificCalculator
        CalculatorOp_Basic calculator = new CalculatorOp_Basic();
        // Perform addition operation with two numbers
        double result = calculator.addition(10.0, 10.0);
        // Verify that the addition result is as expected
        assertEquals("Addition result is incorrect", 20.0, result, 0.001);
    }

    // Test method for subtraction functionality
    @Test
    public void testSubtraction() {
        // Create a new instance of a ScientificCalculator
        CalculatorOp_Basic calculator = new CalculatorOp_Basic();
        // Perform subtraction with two numbers
        double result = calculator.subtraction(20.0, 10.0);
        // Verify that the subtraction result is expected
        assertEquals("Subtraction result is incorrect", 10.0, result, 0.001);
    }

    // Test the method for multiplication functionality
    @Test
    public void testMultiplication() {
        // Create a new instance of a ScientificCalculator
        CalculatorOp_Basic calculator = new CalculatorOp_Basic();
        // Perform multiplication of two numbers
        double result = calculator.multiplication(10.0, 10.0);
        // Verify that the result is as expected
        assertEquals("Multiplication result is incorrect", 100.0, result, 0.001);
    }

    //Test the method for division functionality
    @Test
    public void testDivision() {
        // Create a new instance of a ScientificCalculator
        CalculatorOp_Basic calculator = new CalculatorOp_Basic();
        // Perform Division of two numbers
        double result = calculator.division(10.0, 2.0);
        // Verify the result as is expected
        assertEquals("Division result is incorrect", 5.0, result, 0.001);
    }

    // Test method for inverse functionality
    @Test
    public void testInverse() {
        // Create a new instance of ScientificCalculator
        CalculatorOp_Basic calculator = new CalculatorOp_Basic();
        // Perform inverse operation on a number
        double result = calculator.inverse(4.0);
        // Verify that the inverse result is as expected
        assertEquals("Inverse result is incorrect", 0.25, result, 0.001);
    }

    // Test method for square functionality
    @Test
    public void testSquare() {
        // Create a new instance of ScientificCalculator
        CalculatorOp_Basic calculator = new CalculatorOp_Basic();
        // Perform square operation on a number
        double result = calculator.square(5.0);
        // Verify that the square result is as expected
        assertEquals("Square result is incorrect", 25.0, result, 0.001);
    }

    // Test method for square root functionality
    @Test
    public void testSquareRoot() {
        // Create a new instance of ScientificCalculator
        CalculatorOp_Basic calculator = new CalculatorOp_Basic();
        // Perform square root operation on a number
        double result = calculator.squareroot(16.0);
        // Verify that the square root result is as expected
        assertEquals("Square root result is incorrect", 4.0, result, 0.001);
    }


    // SCIENTIFIC

    // Test method for exponentiation functionality
    @Test
    public void testExponentiation() {
        // Create a new instance of ScientificCalculator
        CalculatorOp_Basic calculator = new CalculatorOp_Basic();
        // Perform exponentiation operation with a base and an exponent
        double result = calculator.exponential(2.0, 3.0);
        // Verify that the exponentiation result is as expected
        assertEquals("Exponentiation result is incorrect", 8.0, result, 0.001);
    }

    // Test method for binary conversion functionality
    @Test
    public void testConvertToBinary() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Convert an integer to its binary string representation
        String result = calculator.convertToBinary(4);
        // Verify that the binary conversion result is as expected
        assertEquals("Binary conversion result is incorrect", "100", result);
    }

    // Test method for sine value calculation
    @Test
    public void testSineValue() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Calculate the sine of a number (input in degrees converted to radians)
        double result = calculator.sineValue(0); // Sine of 0 degrees
        // Verify that the sine value is as expected
        assertEquals("Sine value calculation is incorrect", 0.0, result, 0.001);
    }

    // Test method for logarithm calculation
    @Test
    public void testLogarithm() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Calculate the base-10 logarithm of a number
        double result = calculator.logarithm(10); // Logarithm base 10 of 10
        // Verify that the logarithm value is as expected
        assertEquals("Logarithm calculation is incorrect", 1.0, result, 0.001);
    }

    // Test method for factorial calculation
    @Test
    public void testFactorial() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Calculate the factorial of a number
        long result = calculator.factorial(5); // Factorial of 5
        // Verify that the factorial result is as expected
        assertEquals("Factorial calculation is incorrect", 120, result);
    }

    // Test method for octal conversion
    @Test
    public void testConvertToOctal() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Convert an integer to its octal string representation
        String result = calculator.convertToOctal(8);
        // Verify that the octal conversion result is as expected
        assertEquals("Octal conversion is incorrect", "10", result);
    }

    // Test method for hexadecimal conversion
    @Test
    public void testConvertToHexadecimal() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Convert an integer to its hexadecimal string representation
        String result = calculator.convertToHexadecimal(15);
        // Verify that the hexadecimal conversion result is as expected
        assertEquals("Hexadecimal conversion is incorrect", "f", result);
    }

    // Test method for decimal conversion
    @Test
    public void testConvertToDecimal() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Convert an integer to its decimal string representation
        String result = calculator.convertToDecimal(10);
        // Verify that the decimal conversion result is as expected
        assertEquals("Decimal conversion is incorrect", "10", result);
    }

    // Test method for tangent calculation
    @Test
    public void testTangentValue() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Calculate the tangent of a number in radians
        double result = calculator.tangentValue(0);
        // Verify that the tangent result is as expected
        assertEquals("Tangent calculation is incorrect", 0.0, result, 0.001);
    }

    // Test method for inverse logarithm calculation
    @Test
    public void testInverseLogarithm() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Calculate the inverse logarithm (10^x) of a number
        double result = calculator.inverseLogarithm(1);
        // Verify that the inverse logarithm result is as expected
        assertEquals("Inverse logarithm calculation is incorrect", 10, result, 0.001);
    }

    // Test method for natural logarithm calculation
    @Test
    public void testNaturalLogarithm() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Calculate the natural logarithm (ln) of a number
        double result = calculator.naturalLogarithm(1);
        // Verify that the natural logarithm result is as expected
        assertEquals("Natural logarithm calculation is incorrect", 0, result, 0.001);
    }

    // Test method for inverse natural logarithm calculation
    @Test
    public void testInverseNaturalLogarithm() {
        // Create a new instance of ScientificCalculator
        Scientific calculator = new Scientific();
        // Calculate the exponential (e^x) of a number
        double result = calculator.inverseNaturalLogarithm(1);
        // Verify that the inverse natural logarithm result (e^x) is as expected
        assertEquals("Inverse natural logarithm calculation is incorrect", Math.E, result, 0.001);
    }


}




