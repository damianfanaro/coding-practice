package com.damianfanaro.coding.practice.string.permutation;

import java.util.Arrays;

import static com.damianfanaro.coding.practice.SystemOutUtil.println;

public class CheckStringIsPermutation {

    public static void main(String[] args) {
        println(isSecondStringAPermutation("abc", "cba"));
        println(isSecondStringAPermutation("abc", "abcc"));
        println(isSecondStringAPermutation("bfa", "def"));

        println(isSecondStringAPermutationASCII("abc", "cba"));
        println(isSecondStringAPermutationASCII("abc", "abcc"));
        println(isSecondStringAPermutationASCII("bfa", "def"));
    }

    /**
     * Time complexity: Big O(N * log N)
     */
    private static boolean isSecondStringAPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    private static String sort(String str) {
        char[] characters = str.toCharArray();
        Arrays.sort(characters);
        return Arrays.toString(characters);
    }

    /**
     * Time complexity: Big O(N)
     */
    private static boolean isSecondStringAPermutationASCII(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            letters[str2.charAt(i)]--;
            if (letters[str2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

}
