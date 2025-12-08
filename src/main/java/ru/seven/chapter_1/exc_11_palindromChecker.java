package ru.seven.chapter_1;

public class exc_11_palindromChecker {
    private static final String STR = "abrba";
    public static void main(String[] args) {
        System.out.println(isPalindrom(STR));
    }

    private static boolean isPalindrom(String str) {
        boolean isPal = false;
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            isPal = true;
        }

        return isPal;
    }
}
