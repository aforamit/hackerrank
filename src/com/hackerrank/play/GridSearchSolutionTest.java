package com.hackerrank.play;

import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.Assert.assertEquals;

/**
 * Created by amit on 12/16/2015.
 */
public class GridSearchSolutionTest {

    @Test
    public void testSearchGrid() throws Exception {
        Scanner s = new Scanner("2\n" +
                "10 10\n" +
                "7283455864\n" +
                "6731158619\n" +
                "8988242643\n" +
                "3830589324\n" +
                "2229505813\n" +
                "5633845374\n" +
                "6473530293\n" +
                "7053106601\n" +
                "0834282956\n" +
                "4607924137\n" +
                "3 4\n" +
                "9505\n" +
                "3845\n" +
                "3530\n" +
                "15 15\n" +
                "400453592126560\n" +
                "114213133098692\n" +
                "474386082879648\n" +
                "522356951189169\n" +
                "887109450487496\n" +
                "252802633388782\n" +
                "502771484966748\n" +
                "075975207693780\n" +
                "511799789562806\n" +
                "404007454272504\n" +
                "549043809916080\n" +
                "962410809534811\n" +
                "445893523733475\n" +
                "768705303214174\n" +
                "650629270887160\n" +
                "2 2\n" +
                "99\n" +
                "99\n");
        GridSearchSolution.search(GridSearchSolution.parseGrids(s));
    }
}