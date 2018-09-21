package com.hackerrank.play;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by amit on 12/9/2015.
 */
public class CandiesSolutionTest {

    @Test
    public void testSumCandies() throws Exception {
        assertEquals(CandiesSolution.sumCandies(new int[]{1, 2, 3}), 6);
        assertEquals(CandiesSolution.sumCandies(new int[]{1, 2, 3, 4,4,4,3,2,1}), 21);
        assertEquals(CandiesSolution.sumCandies(new int[]{1, 2, 3,4,4,4,2,1}), 17);
    }
}