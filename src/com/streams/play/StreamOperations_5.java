package com.streams.play;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class StreamOperations_5 {

    public static void main(String[] args) {

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
                .filter(s -> s > 100)
                .reduce((s1, s2) -> s1 + s2);
        System.out.println("reduce ops : sum");
        System.out.println(reduce);

        IntStream.range(65, 70)
                .mapToObj(i -> String.valueOf(i))
                .reduce((s1, s2) -> s1 + "$$" + s2);
        //collected.stream().forEach(System.out::println);

        Optional<String> reduce1 = Arrays.asList("JP", "Morgan", "Chase", "Worldwide", "LLC")
                .stream()
                .reduce((l, r) -> l + " " + r);
        System.out.println("reduce ops : string");
        System.out.println(reduce1.get());

    }

    private static String formatStr(char i) {
        //System.out.println(format("Formatting ==> %s", i));
        return format("%s%s%s", i, i, i);
    }

}
