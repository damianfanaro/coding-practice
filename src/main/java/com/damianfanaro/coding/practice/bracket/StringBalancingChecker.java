package com.damianfanaro.coding.practice.bracket;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

final class StringBalancingChecker {

    private final Map<Character, Character> openingSymbols;
    private final Map<Character, Character> closingSymbols;

    StringBalancingChecker() {
        openingSymbols = new HashMap<>();
        closingSymbols = new HashMap<>();
        loadPredefinedSymbols();
    }

    /**
     * Given an input string with symbols, this algorithm checks if
     * it is balanced or not and if it is syntactically correct.
     *
     * For example:
     * - (()) : is balanced and syntactically correct.
     * - ))(( : is balanced but syntactically incorrect.
     * - (((( : not balanced and syntactically incorrect.
     *
     * Time complexity of this algorithm is O(N),
     * being N the length of the input parameter.
     *
     * @param input the string to be checked for balancing
     * @return true if the input string is balanced, otherwise false
     * @throws NullPointerException if the input string is null
     */
    boolean isBalanced(String input) {
        Objects.requireNonNull(input);

        Stack<Character> symbols = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (symbols.empty()) {
                symbols.push(input.charAt(i));
            } else {
                char charFromInput = input.charAt(i);
                char charFromStack = symbols.peek();
                if (isOpeningSymbol(charFromStack) && isClosingSymbol(charFromInput) && !matched(charFromStack, charFromInput)) {
                    return false;
                } else if (isOpeningSymbol(charFromStack) && isClosingSymbol(charFromInput)) {
                    symbols.pop();
                } else {
                    symbols.push(charFromInput);
                }
            }
        }

        return symbols.empty();
    }

    private boolean isOpeningSymbol(char aChar) {
        return openingSymbols.containsKey(aChar);
    }

    private boolean isClosingSymbol(char aChar) {
        return closingSymbols.containsKey(aChar);
    }

    private boolean matched(char openingChar, char closingChar) {
        return openingSymbols.get(openingChar).equals(closingChar);
    }

    private void loadPredefinedSymbols() {
        openingSymbols.put('(', ')');
        closingSymbols.put(')', '(');

        openingSymbols.put('[', ']');
        closingSymbols.put(']', '[');

        openingSymbols.put('{', '}');
        closingSymbols.put('}', '{');
    }

}
