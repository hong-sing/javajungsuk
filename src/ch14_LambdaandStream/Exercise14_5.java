package ch14_LambdaandStream;

import java.util.stream.Stream;

public class Exercise14_5 {
    public static void main(String[] args) {
        String[] strArr = { "aaa","bb","c", "dddd" };
        Stream<String> strStream = Stream.of(strArr);   // String[]을 Stream<String>으로
        int sum = strStream.mapToInt(s -> s.length())   // strStream에서 문자열 하나 꺼내서 문자열 길이를 int로 변환
                .sum(); // 합
        System.out.println("sum="+sum);
    }
}
