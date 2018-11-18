package com.damianfanaro.coding.practice.string;

import static com.damianfanaro.coding.practice.SystemOutUtil.println;

public class StringPermutationWithRecursion {

    private static final String INITIAL_PREFIX = "";

    public static void main(String[] args) {
        permutation("abc");
        permutation("123456");
    }

    private static void permutation(String stringToPermute) {
        permutation(stringToPermute, INITIAL_PREFIX);
    }

    private static void permutation(String stringToPermute, String prefix) {
        if (stringToPermute.isEmpty()) {
            println(prefix);
        } else {
            for (int i = 0; i < stringToPermute.length(); i++) {
                String remaining = stringToPermute.substring(0, i) + stringToPermute.substring(i + 1);
                permutation(remaining, prefix + stringToPermute.charAt(i));
            }
        }
    }

}
