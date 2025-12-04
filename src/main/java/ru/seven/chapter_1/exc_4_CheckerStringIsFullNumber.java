package ru.seven.chapter_1;

/** Проверка, содержит ли слово только цифры **/
public class exc_4_CheckerStringIsFullNumber {
    public static void main(String[] args) {
        System.out.println(isFullNumberString("1"));
        System.out.println(isDigit("12345f6123"));
    }

    private static boolean isFullNumberString(String str) {
        String[] numbers = "0123456789".split("");
        String[] array = str.split("");
        int count = 0;
        for (String s : array) {
            for (String number : numbers) {
                if (s.equals(number)) {
                    count++;
                    break;
                }
            }
        }
        return count == array.length;
    }

    private static boolean isDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

