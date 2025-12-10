package ru.seven.chapter_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exc_9_connectStrWithSplitter {
    public static void main(String[] args) {
        String[] array = {"Hello", "MyFather", "String", "Word"};
        System.out.println(connectorString(array, "_+_"));
    }

    private static String connectorString(String [] array, String connector) {
        return Arrays.stream(array).map(str -> new StringBuilder().append(str).append(connector)).collect(Collectors.joining());
    }
}
