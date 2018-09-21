package com.streams.play;

import java.util.*;
import java.util.function.Function;
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

        List<String> fruitNames = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
        Map<String, Long> fruitsNamesMap = fruitNames.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("FruitsName Map : " + fruitsNamesMap);;

        List<Fruit> fruits = Arrays.asList(
                newFruit("apple", 8),
                newFruit("banana", 4),
                newFruit("mango", 7),
                newFruit("apple", 3),
                newFruit("banana", 2),
                newFruit("mango", 4),
                newFruit("mango", 5)
        );
        Map<String, List<Fruit>> fruitsMap = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName));
        System.out.println("Fruits Map : " + fruitsMap);;

        Map<Integer, List<Fruit>> fruitsQty = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getQuantity));
        System.out.println("Fruits Map : " + fruitsQty);;

    }

    static class Fruit{
        final String name;
        final int quantity;

        Fruit(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }

    static Fruit newFruit(String name, int qty){
        return new Fruit(name, qty);
    }



    private static String formatStr(char i) {
        //System.out.println(format("Formatting ==> %s", i));
        return format("%s%s%s", i, i, i);
    }

}
