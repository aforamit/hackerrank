import java.util.*;
import java.util.stream.IntStream;

public class CandiesSolution {
    static int[] parseRatings() {
        Scanner s = new Scanner(System.in);
        IntStream ratings = IntStream.range(0, Integer.parseInt(s.nextLine()))
                                .map(i -> Integer.parseInt(s.nextLine()));
        return ratings.toArray();
    }

    static int sumCandies(int[] ratings) {
        int[] candies = IntStream.range(0, ratings.length).map(i -> 1).toArray();
        candies(ratings, 0, candies);
        return Arrays.stream(candies).sum();
    }

    static void candies(int[] ratings, int index, int[] candies) {
        if (index >= ratings.length) {
            return;
        }
        if (index == 0) {
            candies(ratings, index + 1, candies);
            if (ratings[index] > ratings[index + 1]) {
                candies[index] = candies[index + 1] + 1;
            }
            return;
        }

        if (ratings[index - 1] < ratings[index]) {
            candies[index] = candies[index - 1] + 1;
        }
        candies(ratings, index + 1, candies);
        if (index + 1 < candies.length && ratings[index] > ratings[index + 1]) {
            if (candies[index] < candies[index + 1] + 1) {
                candies[index] = candies[index + 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        System.out.println(sumCandies(parseRatings()));
    }
}