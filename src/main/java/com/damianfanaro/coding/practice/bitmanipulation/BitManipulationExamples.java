package com.damianfanaro.coding.practice.bitmanipulation;

import static com.damianfanaro.coding.practice.SystemOutUtil.println;

public class BitManipulationExamples {

    public static void main(String[] args) {
        showExamples();
        isEvenNumber();
        isPowerOfTwo();
        countNumberOfDifferentBits();
    }

    private static void showExamples() {
        byte number1 = 5;
        byte number2 = 2;

        println(number1 + " in binary is " + Integer.toBinaryString(number1));
        println(number2 + " in binary is " + Integer.toBinaryString(number2));

        int bitCount = Integer.bitCount(number1);
        println("Number " + number1 + ": Bit count " + bitCount);

        println("~" + number1 + " is " + ~number1);
        println("~" + number2 + " is " + ~number2);
        println(number1 + " & " + number2 + " is " + (number1 & number2));
        println(number1 + " | " + number2 + " is " + (number1 | number2));
        println(number1 + " ^ " + number2 + " is " + (number1 ^ number2));
        println(number1 + ", left shift << 2 positions: " + (number1 << 2));
        println(number1 + ", right shift >> 2 positions: " + (number1 >> 2));
    }

    private static void isEvenNumber() {
        println("Is 3 even number? " + isEvenNumber(3));
        println("Is 34567 even number? " + isEvenNumber(34567));
        println("Is 2 even number? " + isEvenNumber(2));
        println("Is 2456 even number? " + isEvenNumber(2456));
    }

    private static boolean isEvenNumber(int number) {
        return (number & 1) == 0;
    }

    private static void isPowerOfTwo() {
        println("Is 1 a power of 2? " + isPowerOfTwo(1));
        println("Is 2 a power of 2? " + isPowerOfTwo(2));
        println("Is 4 a power of 2? " + isPowerOfTwo(4));
        println("Is 1024 a power of 2? " + isPowerOfTwo(1024));
        println("Is 4096 a power of 2? " + isPowerOfTwo(4096));

        println("Is 123 a power of 2? " + isPowerOfTwo(123));
        println("Is 456 a power of 2? " + isPowerOfTwo(456));
        println("Is 789 a power of 2? " + isPowerOfTwo(789));
    }

    private static boolean isPowerOfTwo(int number) {
        return (number & number - 1) == 0;
    }

    private static void countNumberOfDifferentBits() {
        println("Number of different bits between 5 and 5: " + countNumberOfDifferentBits(5, 5));
        println("Number of different bits between 3 and 2: " + countNumberOfDifferentBits(3, 2));
    }

    private static int countNumberOfDifferentBits(int number1, int number2) {
        return Integer.bitCount(number1 ^ number2);
    }

}
