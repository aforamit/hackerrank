package com.hackerrank.play;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by amit on 12/16/2015.
 */
public class GridSearchSolution {
    static class GridPair {
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();

        @Override
        public String toString() {
            return "GridPair{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    static List<GridPair> parseGrids(Scanner s) {
        return IntStream.range(0, Integer.parseInt(s.nextLine()))
                .mapToObj(i -> {
                    GridPair pair = new GridPair();
                    readGrid(s, pair.left);
                    readGrid(s, pair.right);
                    return pair;
                }).collect(Collectors.toList());
    }

    private static void readGrid(Scanner s, List<String> grid) {
        String[] rowColumn = s.nextLine().split(" ");
        IntStream.range(0, Integer.parseInt(rowColumn[0])).forEach(j -> {
            grid.add(s.nextLine());
        });
    }

    static void search(List<GridPair> pairs) {
        pairs.forEach(pair -> {
            System.out.println(searchGrid(pair) ? "YES" : "NO");
        });
    }

    static boolean searchGrid(GridPair pair) {
        return pair.right.stream().limit(1).map(first -> {
            return searchIndex(pair.left, first).stream().map(index -> {
                return IntStream.range(1, pair.right.size()).map(i -> {
                    List<String> searchable = pair.left.stream().skip(index.listIndex + i)
                            .limit(1).collect(Collectors.toList());
                    return searchIndexLimit(searchable, pair.right.get(i), index.startIndex);
                }).noneMatch(i -> i == -1);
            }).filter(found -> found == true).findFirst().orElse(false);
        }).filter(found -> found == true).findFirst().orElse(false);
    }

    static class Indexes {
        int listIndex;
        int startIndex;
    }

    private static List<Indexes> searchIndex(List<String> searchable, String first) {
        return searchable.stream().filter(e -> (e.indexOf(first) != -1))
                .map(e -> {
                    Indexes ind = new Indexes();
                    ind.listIndex = searchable.indexOf(e);
                    ind.startIndex = e.indexOf(first);
                    return ind;
                }).collect(Collectors.toList());
    }

    private static Integer searchIndexLimit(List<String> searchable, String toSearch, int startIndex) {
        return searchable.stream().filter(
                e -> (e.indexOf(toSearch, startIndex) == startIndex))
                .limit(1)
                .mapToInt(e -> searchable.indexOf(e))
                .boxed().findFirst().orElse(-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        search(parseGrids(new Scanner(System.in)));
    }
}
