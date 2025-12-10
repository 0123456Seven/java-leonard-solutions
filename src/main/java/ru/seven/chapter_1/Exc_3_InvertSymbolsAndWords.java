package ru.seven.chapter_1;

import java.util.Arrays;
import java.util.stream.Collectors;

/** Инвертирование букв и слов **/
public class Exc_3_InvertSymbolsAndWords {
    private static final String pattern = " ";
    public static void main(String[] args) {
        String word = "Java anywhere the best";
        System.out.println(reverse(word));
    }

    private static String reverse(String str) {
        return Arrays.stream(str.split(pattern))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(pattern));
    }
}
