package com.damianfanaro.coding.practice.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WholeSquareTest {

    @Test
    void calculateWholeSquares() {
        assertEquals(1, WholeSquare.solution(2, 4));
        assertEquals(1, WholeSquare.solution(-2, 4));
        assertEquals(1, WholeSquare.solution(-2, -4));
        assertEquals(1, WholeSquare.solution(0, 0));
        assertEquals(3, WholeSquare.solution(4, 17));
        assertEquals(46341, WholeSquare.solution(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void calculateWholeSquaresFormula() {
        assertEquals(1, WholeSquare.solutionFormula(2, 4));
        assertEquals(1, WholeSquare.solutionFormula(-2, 4));
        assertEquals(1, WholeSquare.solutionFormula(-2, -4));
        assertEquals(1, WholeSquare.solutionFormula(0, 0));
        assertEquals(3, WholeSquare.solutionFormula(4, 17));
        assertEquals(46341, WholeSquare.solutionFormula(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

}
