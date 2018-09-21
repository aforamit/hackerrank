package com.hackerrank.play;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by amit on 12/25/2015.
 */
public class EncryptionSolution {

    public static void main(String[] args) {
       System.out.println(encrypt(readText(new Scanner(System.in))));
    }

    static String encrypt(String str) {
        String s = str.replaceAll(" ", "");

        System.out.println("input ==> " + s);
        double floor = Math.floor(Math.sqrt(s.length()));
        double ceil = Math.ceil(Math.sqrt(s.length()));

        int row = (int) floor;
        int column = Math.min((int) ceil, row + 1);

        System.out.println("length => " + s.length() + " ; row => " + row + " ; ceil => " + ceil + " ; column => " + column);

        //char[] arr = s.toCharArray();
        return IntStream.range(0, column ).mapToObj(r ->
                IntStream.range(0, column)
                        .filter(c -> (r + (c * column)) < s.length())
                        .mapToObj(c -> String.valueOf(s.charAt(r + (c * column))))
                        .reduce((result, e) -> (result += e)).get())
        .reduce((result, e) -> (result = (result + " " + e))).get();
    }

    static String readText(Scanner s) {
        return s.next();
    }
}
