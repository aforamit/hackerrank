package com.hackerrank.play;

import org.testng.annotations.Test;

/**
 * Created by amit on 12/16/2015.
 */
public class InsertionSortPart1SolutionTest {

    @Test
    public void testInsertionSort() throws Exception {
        InsertionSortPart1Solution.insertIntoSorted(new int[]{2,4,6,8,3});
        System.out.println();
        InsertionSortPart1Solution.insertIntoSorted(new int[]{2,4,6,8,1});
        System.out.println();
        InsertionSortPart1Solution.insertIntoSorted(new int[]{2,4,6,8,7});
        System.out.println();
        InsertionSortPart1Solution.insertIntoSorted(new int[]{2,4,6,8,9});
        System.out.println();
        InsertionSortPart1Solution.insertIntoSorted(new int[]{2,4,8,8,7});
        System.out.println();
        InsertionSortPart1Solution.insertIntoSorted(new int[]{2});
        System.out.println();
        InsertionSortPart1Solution.insertIntoSorted(new int[]{2, 1});
        System.out.println();
        InsertionSortPart1Solution.insertIntoSorted(new int[]{-2, 1});
        System.out.println();
        InsertionSortPart1Solution.insertIntoSorted(new int[]{2,3,4,5,6,7,8,9,10,1});
    }
}