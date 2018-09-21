package com.hackerrank.play;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

/**
 * Created by amit on 1/19/2016.
 */
public class SnakeAndLaddersSolution {

    static class SnakesAndLadders {
        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladders = new HashMap<>();
    }

    static List<SnakesAndLadders> parseSnakesAndLaddersPoints(Scanner s) {
        return IntStream.range(0, Integer.parseInt(s.nextLine()))
                .mapToObj(i -> {
                    SnakesAndLadders sl = new SnakesAndLadders();
                    readPoints(s, sl.snakes);
                    readPoints(s, sl.ladders);
                    return sl;
                }).collect(Collectors.toList());
    }

    private static void readPoints(Scanner s, Map<Integer, Integer> points) {
        IntStream.range(0, Integer.parseInt(s.nextLine())).forEach(j -> {
            String[] pointPair = s.nextLine().split(" ");
            points.put(Integer.parseInt(pointPair[0]), Integer.parseInt(pointPair[1]));
        });
    }

    public static void main(String[] args) {
        parseSnakesAndLaddersPoints(new Scanner(System.in)).forEach(i -> {
            System.out.println(playGame(i));
        });
    }

    private static int playGame(SnakesAndLadders i) {
        int noOfTurns = 0;

        return noOfTurns;
    }


}
