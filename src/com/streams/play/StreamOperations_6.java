package com.streams.play;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class StreamOperations_6 {

    public static void main(String[] args) {
        List<String> fruitNames = Arrays.asList("apple", "banana", "apricot", "orange", "banana", "papaya");
        boolean a = fruitNames.stream()
                .anyMatch(f -> f.startsWith("a"));


        Set<Fruit> fruits = new HashSet(Arrays.asList(
                newFruit("apple", 8),
                newFruit("banana", 4),
                newFruit("mango", 7),
                newFruit("apple", 3),
                newFruit("banana", 2),
                newFruit("mango", 4),
                newFruit("mango", 5)
        ));

        Fruit someFruit = fruits.stream().findFirst().orElse(newFruit("papaya", 5));
        System.out.println("first" + someFruit);

        Fruit anyFruit = fruits.stream().findAny().orElse(newFruit("papaya", 5));
        System.out.println("any" + someFruit);

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

}
