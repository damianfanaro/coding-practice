package com.damianfanaro.coding.practice;

public final class SystemOutUtil {

    public static void println(String str) {
        System.out.println(str);
    }

    public static void println(boolean strBoolean) {
        println(String.valueOf(strBoolean));
    }

    public static void println(int strInt) {
        println(String.valueOf(strInt));
    }

}
