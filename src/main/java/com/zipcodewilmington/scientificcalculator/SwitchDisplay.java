package com.zipcodewilmington.scientificcalculator;

// switch double input to binary
public class SwitchDisplay {
    public static String switchBinary(double input) {
        long bits = Double.doubleToLongBits(input);
        return Long.toBinaryString(bits);

    }

    // switch double input to octal
    public static String switchOctal(double input) {
        long bits = Double.doubleToLongBits(input);
        return Long.toOctalString(bits);
    }

    // switch double input to decimal
    public static String switchDecimal(double input) {
        return Double.toString(input);
    }

    // switch double input to hexadecimal
    public static String switchHexadecimal(double input) {
        long bits = Double.doubleToLongBits(input);
        return Long.toHexString(bits);
    }
}


// comment