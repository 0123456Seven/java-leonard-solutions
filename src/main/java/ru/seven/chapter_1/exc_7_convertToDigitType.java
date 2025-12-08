package ru.seven.chapter_1;

import java.util.Arrays;

public class exc_7_convertToDigitType {
    private static final String TO_INT = "453";
    private static final String TO_LONG = "45338843838";
    private static final String TO_DOUBLE = "13.234234234D";
    private static final String TO_FLOAT = "45.238F";
    public static void main(String[] args) {
        Integer intFromString = Integer.parseInt(TO_INT);
        Long longFromString = Long.parseLong(TO_LONG);
        Double doubleFromString = Double.parseDouble(TO_DOUBLE);
        Float floatFromString = Float.parseFloat(TO_FLOAT);

        System.out.println(intFromString);
        System.out.println(longFromString);
        System.out.println(floatFromString);
        System.out.println(doubleFromString);
    }
}
