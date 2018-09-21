package com.hackerrank.play;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

/**
 * Created by amit on 12/20/2015.
 */
public class CavityMapSolution {

    static String[][] parseInput(Scanner s) {
        int length = parseInt(s.nextLine());
        String[][] objArr = new String[length][length];
        IntStream.range(0, length).forEach(i -> {
            objArr[i] = s.nextLine().split("|");
        });
        return objArr;
    }

    public static void main(String[] args) {
        markCavityMap(parseInput(new Scanner(System.in)));
    }

    static void markCavityMap(String[][] input) {
        IntStream.range(1, input.length - 1).forEach(i -> {
            IntStream.range(1, input.length - 1).forEach(j -> {
                if (isNotX(input, i, j) && isCaptive(input, i, j)) {
                    input[i][j] = "X";
                }
            });
        });
        Arrays.stream(input).map(arr -> Arrays.stream(arr).reduce((result, element) -> {
            result += element;
            return result;
        })).forEach(e -> {
            System.out.println(e.get());
        });
    }

    private static boolean isNotX(Object[][] input, int i, int j) {
        return input[i][j - 1] != "X" && input[i][j + 1] != "X"
                && input[i - 1][j] != "X" && input[i + 1][j] != "X";
    }

    private static boolean isCaptive(String[][] input, int i, int j) {
        return parseInt(input[i][j - 1]) < parseInt(input[i][j])
                && parseInt(input[i][j + 1]) < parseInt(input[i][j])
                && parseInt(input[i - 1][j]) < parseInt(input[i][j])
                && parseInt(input[i + 1][j]) < parseInt(input[i][j]);
    }
}
