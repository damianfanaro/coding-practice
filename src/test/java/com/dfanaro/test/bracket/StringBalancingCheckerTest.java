package com.dfanaro.test.bracket;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * Unit test for {@link StringBalancingChecker}.
 */
public class StringBalancingCheckerTest {

    private static StringBalancingChecker stringBalancingChecker;

    private static Stream<String> validInputs;
    private static Stream<String> invalidInputs;

    @BeforeClass
    public static void setUp() {
        stringBalancingChecker = new StringBalancingChecker();
        validInputs = Stream.of("(){}[]", "((([[[{{{}}}]]])))", "({()})", "({}){[]}", "");
        invalidInputs = Stream.of(")", "(", "((]))", ")(", "({)}");
    }

    @Test
    public void inputsAreBalancedTest() {
        validInputs.forEach(input -> Assert.assertTrue(stringBalancingChecker.isBalanced(input)));
    }

    @Test
    public void inputsAreNotBalancedTest() {
        invalidInputs.forEach(input -> Assert.assertFalse(stringBalancingChecker.isBalanced(input)));
    }

    @Test(expected = NullPointerException.class)
    public void nullInputTest() {
        stringBalancingChecker.isBalanced(null);
    }

}
