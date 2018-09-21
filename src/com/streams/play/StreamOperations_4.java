package com.streams.play;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class StreamOperations_4 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        IntStream.range(65, 91)
                .mapToObj(i -> formatStr((char) i))
                .forEach(s -> strings.add(s));

        List<String> collected = IntStream.range(65, 91)
                .mapToObj(i -> formatStr((char) i))
                .collect(Collectors.toList());
        //collected.stream().forEach(System.out::println);

        System.out.println(IntStream.range(65, 91)
                .mapToObj(i -> formatStr((char) i))
                .collect(Collectors.counting()));

        // Reduce Operations
        OptionalInt reduce2 = IntStream.range(1, 6)
                .peek(s -> System.out.println("s : " + s))
                .reduce((s1, s2) -> {
                    System.out.println(format("s1:%s ; s2:%s ", s1, s2));
                    return s1 + (2 * s2);
        });
        System.out.println("reduce ops : sum2");
        reduce2.ifPresent(System.out::println);

        OptionalInt reduce = IntStream.range(1, 6)
                .map(s -> 2 * s)
                .peek(s -> System.out.println("s : " + s))
                //.filter(s -> s > 100)
                .reduce((s1, s2) -> s1 + s2);

        System.out.println("reduce ops : sum");
        System.out.println(reduce);


        System.out.println(IntStream.range(65, 70)
                .mapToObj(i -> formatStr((char) i))
                .reduce((s1, s2) -> s1 + "$$" + s2));

        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);

    }

    private static String formatStr(char i) {
        //System.out.println(format("Formatting ==> %s", i));
        return format("%s%s%s", i, i, i);
    }

}
