package ru.seven.chapter_1;

import java.util.*;

public class exc_5_CountingVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "hello      24213412412";
        System.out.println(countVAndC(str));
    }


    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Map<String, Integer> countVAndC(String str) {
        int v = 0;
        int c = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                v++;
            } else if (ch >= 'a' && ch <= 'z') {
                c++;
            }
        }
        Map<String, Integer> vAndC = new HashMap<>();
        vAndC.put("consonants", c);
        vAndC.put("vowels", v);
        return vAndC;
    }
}
