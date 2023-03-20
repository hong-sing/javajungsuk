package ch14_LambdaandStream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_7 {
    public static void main(String[] args) {
        // 방법 1
        IntStream intStream = new Random().ints(1,46);  // 무한 스트림
        intStream.limit(6).sorted().forEach(System.out::println);

        // 방법 2
        IntStream intStream1 = new Random().ints(6, 1, 46);
        intStream1.sorted().forEach(System.out::println);

        // 방법 3
        new Random().ints(1,46)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);
    }
}
