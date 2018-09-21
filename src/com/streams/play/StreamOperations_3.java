package com.streams.play;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.String.format;

/**
 * Created by amit on 9/16/2018.
 */
public class StreamOperations_3 {

    public static void main(String[] args) {

        Stream<String> sysoutStream = IntStream.range(65, 91)   // init
                .skip(2)                                        // intermidiate
                .filter(i -> (i % 2) == 1)                      // intermidiate
                .mapToObj(i -> formatStr((char) i));            // intermidiate
        sysoutStream.forEach(System.out::println);              // terminal

        // Stream will throw error
        //sysoutStream.forEach(System.out::println);

/*
        List<String> strings = IntStream.range(65, 91)
                .mapToObj(i -> formatStr((char) i))
                .sorted(Comparator.reverseOrder())
                .limit(10)
                .collect(Collectors.toList());
        strings.stream().forEach(System.out::println);
*/

/*
        Stream<String> sysoutItr = IntStream.iterate(90, i -> i - 2)   // init
                .limit(13)
                .mapToObj(i -> formatStr((char)i));         // intermidiate
        sysoutItr.forEach(System.out::println);              // terminal

*/
    }

    private static String formatStr(char i) {
        System.out.println(format("Formatting ==> %s", i));
        return format("%s%s%s", i, i, i);
    }
}
