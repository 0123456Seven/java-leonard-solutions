package ru.seven.chapter_1;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateCharacters {
    public static void main(String[] args) {
        String name = "Babatumba";

        Map<Character, Integer> countPairMap = countDuplicate(name);
        Map<Character, Integer> countPairMap_1 = countDuplicateCharacters_1(name);
        Map<Character, Integer> countPairMap_2 = countDuplicate(name);
        System.out.println(countPairMap);
        System.out.println(countPairMap_1);
    }

    private static Map<Character, Integer> countDuplicate(String word) {
        word = word.toLowerCase();
        Map<Character, Integer> pair = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char character = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                if (character == word.charAt(j)) {
                    count++;
                }
                pair.put(character, count);
            }
        }

        return pair;
    }

    private static Map<Character, Integer> countDuplicateCharacters_1(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
