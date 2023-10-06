package com.scaler.lldmodule1.day127.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);

        s1.map((elem) -> elem * 2)
                .filter((elem) -> elem > 5)
                .forEach(System.out::println);

        Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5);

        Integer reduced = s2.map((elem) -> elem * 2)
                .reduce(0, (sum, curr) -> curr + sum);

        System.out.println(reduced);

//        Integer reduced = s2.map((elem) -> elem * 2)
//                .reduce(0, Integer::sum);
//        System.out.println(reduced);

        Stream<Integer> s3 = Stream.of(1, 9, 3, 2, 11, 4);
        Optional<Integer> maximum = s3.reduce((max, curr) -> Math.max(max, curr));
        maximum.ifPresent(System.out::println);
    }
}
