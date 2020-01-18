package _2_5_getting_distinct_strings;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Step1 {
    public static void main(String[] args) {

//        Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
//        The order of elements in the result list may be any. If the input list doesn't contain any strings then the result list should be empty.
//        Hints: it is possible to use sets, maps, lists and so on for helping.
//        Sample Input 1: java scala java clojure clojure || Sample Output 1: clojure java scala
//        Sample Input 2: the three the three the three an an a || Sample Output 2: a an the three

        List<String> listOfStrings = new ArrayList<>(Arrays.asList("java", "scala", "clojure", "clojure", "java", "scala"));
        System.out.println("Result with stream: " + listOfStrings.stream().distinct().collect(Collectors.toList()));

        //way with UnaryOperator
        UnaryOperator<List<String>> operator = x -> {
            return x.stream().distinct().collect(Collectors.toList());
        };

        UnaryOperator<List<String>> op = x -> x.stream().distinct().collect(Collectors.toList());
        System.out.println("Result with lambda: " + operator.apply(listOfStrings));
    }
}
