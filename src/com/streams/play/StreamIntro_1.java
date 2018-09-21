package com.streams.play;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamIntro_1 {
    public static void main(String[] args) {
        System.out.println(sumIterator(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        //System.out.println(sumStream(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
        //Collector<Object, ?, List<Object>> objectListCollector = Collectors::toList;
        List<Integer> collect = IntStream.range(1, 10).map(i -> i * 2).filter(i -> i > 10)
                .mapToObj(i -> i)
                .collect(Collectors.toList());
        IntStream.range(1, 10).forEach(System.out::println);

    }

    public static int sumIterator(List<Integer> ints) {
        Iterator<Integer> it = ints.iterator();
        int sum = 0;

        while (it.hasNext()) {
            Integer next = it.next();
            if (next > 4) {
                sum += next;
            }
        }
        return sum;

    }


    private static int sumStream(List<Integer> integers) {
        return integers.stream()
                .filter(n -> n > 4)
                .mapToInt(i -> i)
                .sum();
    }
}
