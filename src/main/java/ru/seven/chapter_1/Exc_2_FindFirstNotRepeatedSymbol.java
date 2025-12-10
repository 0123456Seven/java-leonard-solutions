package ru.seven.chapter_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Отыскание первого неповторяющегося символа **/
public class Exc_2_FindFirstNotRepeatedSymbol {
    public static void main(String[] args) {
        System.out.println(findFirstNotRepeatedSymbol_1("gghhhddwewrrr"));
        System.out.println(findFirstNotRepeatedSymbol_2("gghhhldwqwrrr"));
    }

    private static char findFirstNotRepeatedSymbol_1(String word) {
        Map<Character, Integer> pairSymbols = new HashMap<>();
        char resultChar = 0;
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char symbol = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                if (symbol == word.charAt(j)) {
                    count++;
                }
                pairSymbols.put(symbol, count);
            }
        }
        for (Map.Entry<Character, Integer> pair : pairSymbols.entrySet()) {
            if (pair.getValue() == 1) {
                resultChar = pair.getKey();
                break;
            }
        }

        return resultChar;
    }

    private static char findFirstNotRepeatedSymbol_2(String str) {
        Map<Character, Integer> pairSymbols = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            pairSymbols.compute(symbol, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> pair : pairSymbols.entrySet()) {
            if (pair.getValue() == 1) {
                return pair.getKey();
            }
        }

        return 0;
    }
}


