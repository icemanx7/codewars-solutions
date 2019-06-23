package com.company;

import java.util.stream.Stream;

public class Main {

    public static void order(String words) {
        String[] seperatedWords = words.split(" ");
        Stream.of(seperatedWords).forEach(i -> System.out.println(i));
        System.out.println(seperatedWords);
    }

    public static void main(String[] args) {

        order("is2 Thi1s T4est 3a");
    }
}
