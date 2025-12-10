package ru.seven.chapter_1;

/* Подсчет появлений некоторого символа */
public class Exc_6_CountingRepeatingSymbolsFromStr {
    public static void main(String[] args) {
        System.out.println(countSymbolFromStr("hellollool", 'l'));
    }

    private static int countSymbolFromStr(String str, Character c) {

        return str.length() - str.replaceAll(c.toString(), "").length();
    }
}
