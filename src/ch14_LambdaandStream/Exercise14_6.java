package ch14_LambdaandStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Exercise14_6 {
    public static void main(String[] args) {
        String[] strArr = { "aaa","bb","c", "dddd" };
        Stream<String> strStream = Arrays.stream(strArr);
        OptionalInt max = strStream.mapToInt(String::length)    // 이번에는 메서드 참조로
                .max(); //반환타입 OptionalInt
        System.out.println(max.getAsInt()); //int형으로 값 가져오기

        strStream.map(String::length)
                .sorted(Comparator.reverseOrder())
                .limit(1).forEach(System.out::print);
    }
}
