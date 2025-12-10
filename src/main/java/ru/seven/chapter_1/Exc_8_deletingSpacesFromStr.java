package ru.seven.chapter_1;

public class Exc_8_deletingSpacesFromStr {
    public static void main(String[] args) {
        System.out.println(deleteSpaces("he   ll  0  oLL"));
    }

    private static String deleteSpaces(String str) {
        return str.replaceAll(" ", "");
    }
}
