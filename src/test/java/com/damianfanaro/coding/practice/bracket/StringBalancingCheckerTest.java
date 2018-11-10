package com.damianfanaro.coding.practice.bracket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringBalancingCheckerTest {

    private static StringBalancingChecker stringBalancingChecker;

    private static Stream<String> validInputs;
    private static Stream<String> invalidInputs;

    @BeforeEach
    void setUp() {
        stringBalancingChecker = new StringBalancingChecker();
        validInputs = Stream.of("(){}[]", "((([[[{{{}}}]]])))", "({()})", "({}){[]}", "");
        invalidInputs = Stream.of(")", "(", "((]))", ")(", "({)}");
    }

    @Test
    void inputsAreBalancedTest() {
        validInputs.forEach(input -> assertTrue(stringBalancingChecker.isBalanced(input)));
    }

    @Test
    void inputsAreNotBalancedTest() {
        invalidInputs.forEach(input -> assertFalse(stringBalancingChecker.isBalanced(input)));
    }

    @Test
    void nullInputTest() {
        Executable nullParameter = () -> stringBalancingChecker.isBalanced(null);

        assertThrows(NullPointerException.class, nullParameter);
    }

}
