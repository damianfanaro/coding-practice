package com.damianfanaro.coding.practice.square;

import java.util.Scanner;

/**
 * An integer P is a whole square if it is a square of some integer Q, i.e. if P = Q * Q.
 * <p>
 * Write a function that given two integers A and B, returns the number of whole squares
 * withing the interval [A..B] (both ends included).
 * <p>
 * For example, given A = 4 and B = 17, the function should return 3 because there are
 * three squares of integers in the interval [4..17], namely 4 = 2 * 2, 9 = 3 * 3 and 16 = 4 * 4.
 * <p>
 * Assume that:
 * <p>
 * - A and B are integers within the range [Integer.MIN_VALUE..Integer.MAX_VALUE].
 * - A <= B.
 * <p>
 * Complexity:
 * <p>
 * - expected worst-case time complexity is O(sqrt(abs(B))).
 * - expected worst-case space complexity is O(1).
 *
 * @author dfanaro
 */
class WholeSquare {

    static int solutionFormula(int A, int B) {
        int absA = A == Integer.MIN_VALUE ? 0 : Math.abs(A);
        int absB = Math.abs(B);
        if (absA > absB) {
            return (int) Math.floor(Math.sqrt(absA)) - (int) Math.ceil(Math.sqrt(absB)) + 1;
        } else {
            return (int) Math.floor(Math.sqrt(absB)) - (int) Math.ceil(Math.sqrt(absA)) + 1;
        }
    }

    static int solution(int A, int B) {
        int absA = A == Integer.MIN_VALUE ? 0 : Math.abs(A);
        int absB = Math.abs(B);
        if (absA > absB) {
            return totalWholeSquares(absB, absA);
        } else {
            return totalWholeSquares(absA, absB);
        }
    }

    private static int totalWholeSquares(int A, int B) {
        int totalWholeSquares = 0;
        int current = A;
        while (current <= B && current != Integer.MIN_VALUE) {
            double currentSqrt = Math.sqrt(current);
            if ((int) currentSqrt == currentSqrt) {
                totalWholeSquares++;
            }
            current++;
        }
        return totalWholeSquares;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfTestCases = scan.nextInt();
        scan.nextLine();
        for (int testCase = 0; testCase < numberOfTestCases; testCase++) {
            String[] newTestCase = scan.nextLine().split(" ");
            int a = Integer.valueOf(newTestCase[0]);
            int b = Integer.valueOf(newTestCase[1]);
            System.out.println(WholeSquare.solution(a, b));
        }
    }

}
