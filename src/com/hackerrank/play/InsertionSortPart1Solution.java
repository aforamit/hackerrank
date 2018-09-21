package com.hackerrank.play;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by amit on 12/31/2015.
 */
public class InsertionSortPart1Solution {

    public static void insertIntoSorted(int[] arr) {
        // Fill up this function
        int toInsert = arr[arr.length - 1];
        //print(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (toInsert < arr[i]) {
                arr[i+1] = arr[i];
                if(i == 0){
                    print(arr);
                    arr[i] = toInsert;
                }
            } else {
                arr[i+1] = toInsert;
                print(arr);
                break;
            }
            print(arr);
        }
    }

    static void print(int[] arr) {
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        insertIntoSorted(parseInput(new Scanner(System.in)));
    }

    private static int[] parseInput(Scanner s) {
        s.nextLine();
        String arr = s.nextLine();
        return Arrays.stream(arr.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
