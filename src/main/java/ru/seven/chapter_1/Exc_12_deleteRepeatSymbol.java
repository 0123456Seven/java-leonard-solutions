package ru.seven.chapter_1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exc_12_deleteRepeatSymbol {
    //* Удаление повторяющихся символов *//
    public static void main(String[] args) {
        System.out.println(deleteRepeatSymbol("hheeeellloooo"));
    }

    private static String deleteRepeatSymbol(String str) {
        Set<Character> uniqSymbols = new LinkedHashSet<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            uniqSymbols.add(symbol);
        }

        StringBuilder sb = new StringBuilder();

        for (Character character : uniqSymbols) {
            sb.append(character);
        }

        return sb.toString();
    }
}
