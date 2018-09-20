package streams_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.lang.String.format;

/**
 * Created by amit on 8/30/2018.
 */
public class PeekStream {

    public static void main(String[] args) {
        //List<String> strings = Arrays.asList("AAA", "BBB", "CCC");
        List<String> strings = IntStream.range(65, 91)
                .mapToObj(i -> format("%s", (char) i))
                .map(s -> format("%s%s%s", s, s, s))
                .sorted((l, r) -> r.compareTo(l))
                .collect(Collectors.toList());
        strings.stream().forEach(System.out::println);
        strings.stream()
                .map(PeekObject::new)
                .sorted((l, r) -> l.getMessage().compareTo(r.getMessage()))
                .limit(6)
                .collect(Collectors.toList()).stream().forEach(System.out::println);
    }

    static class PeekObject {
        private String message;

        public PeekObject(String message) {
            this.message = message;
            System.out.println(format("Constructor called : %s", message));
        }

        public String getMessage() {
            return message;
        }

        @Override
        public String toString() {
            return "PeekObject{" +
                    "message='" + message + '\'' +
                    '}';
        }
    }
}
