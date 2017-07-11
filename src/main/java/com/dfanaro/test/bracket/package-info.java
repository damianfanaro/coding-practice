/**
 * Brackets Problem: Determine whether a given string of parentheses is properly nested.
 * <p>
 * Task description:
 * <p>
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 * <p>
 * - S is empty;
 * - S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * - S has the form "VW" where V and W are properly nested strings. For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(String S); }
 * <p>
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 * <p>
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
 * <p>
 * Assume that:
 * - N is an integer within the range [0..200,000];
 * - string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 * <p>
 * Complexity:
 * - expected worst-case time complexity is O(N);
 * - expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 *
 * @author dfanaro
 */
package com.dfanaro.test.bracket;