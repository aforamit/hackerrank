package streams_examples;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamInit_2 {
    public static void main(String[] args) {
        //
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = integers.stream();
        Stream<Integer> parallelStream = integers.parallelStream();

        //
        int[] ints = {1, 2, 3, 4, 5};
        Arrays.stream(ints);

        //
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        print("Stream from Stream.of 1 - 6", integerStream);
        IntStream range = IntStream.range(1, 6);
        print("Stream from Range 1 - 6", range);

        IntStream builderIntStream = IntStream.builder()
                .add(1).add(2).add(3).add(4).add(5)
                .build();
        print("IntStream using builder", builderIntStream);


        //
        Pattern pattern = Pattern.compile(",");
        Stream<String> stringStream = pattern.splitAsStream("11,12,13,14,15,16");
        print("Stream from Patterns", stringStream);

    }

    static void print(String message, IntStream stream){
        System.out.println(message);
        stream.forEach(System.out::println);
    }
    static void print(String message, Stream stream){
        System.out.println(message);
        stream.forEach(System.out::println);
    }
}
