package com.zipcodewilmington.scientificcalculator;

public class SwitchDisplay {
    public  String switchBinary(double input) {
        long bits = Double.doubleToLongBits(input);
        return Long.toBinaryString(bits);

    }

    // switch double input to octal
    public  String switchOctal(double input) {
        long bits = Double.doubleToLongBits(input);
        return Long.toOctalString(bits);
    }

    // switch double input to decimal
    public  String switchDecimal(double input) {
        return Double.toString(input);
    }

    // switch double input to hexadecimal
    public  String switchHexadecimal(double input) {
        long bits = Double.doubleToLongBits(input);
        return Long.toHexString(bits);
    }
}


