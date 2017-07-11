package com.dfanaro.test.square;

import org.junit.Assert;
import org.junit.Test;

/**
 * See {@link WholeSquare} for details.
 *
 * @author dfanaro
 */
public class WholeSquareTest {

    @Test
    public void calculateWholeSquares() {
        Assert.assertEquals(1, WholeSquare.solution(2, 4));
        Assert.assertEquals(1, WholeSquare.solution(-2, 4));
        Assert.assertEquals(1, WholeSquare.solution(-2, -4));
        Assert.assertEquals(1, WholeSquare.solution(0, 0));
        Assert.assertEquals(3, WholeSquare.solution(4, 17));
        Assert.assertEquals(46341, WholeSquare.solution(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void calculateWholeSquaresFormula() {
        Assert.assertEquals(1, WholeSquare.solutionFormula(2, 4));
        Assert.assertEquals(1, WholeSquare.solutionFormula(-2, 4));
        Assert.assertEquals(1, WholeSquare.solutionFormula(-2, -4));
        Assert.assertEquals(1, WholeSquare.solutionFormula(0, 0));
        Assert.assertEquals(3, WholeSquare.solutionFormula(4, 17));
        Assert.assertEquals(46341, WholeSquare.solutionFormula(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

}
