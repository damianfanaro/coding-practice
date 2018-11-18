package com.damianfanaro.coding.practice.bitmanipulation;

import static com.damianfanaro.coding.practice.SystemOutUtil.println;

public class UniqueChars {

    public static void main(String[] args) {
        println(isUniqueChars("abcdefghijklmnopqrstuvwxyz"));
        println(isUniqueChars("abcdefghijklmnopqrstuvwxyza"));

        println(isUniqueCharsASCII("abcdefghijklmnopqrstuvwxyz"));
        println(isUniqueCharsASCII("abcdefghijklmnopqrstuvwxyza"));
    }

    private static boolean isUniqueChars(String str) {
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }

        return true;
    }

    private static boolean isUniqueCharsASCII(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            final char currentChar = str.charAt(i);
            if (charSet[currentChar]) {
                return false;
            }
            charSet[currentChar] = true;
        }

        return true;
    }

}
