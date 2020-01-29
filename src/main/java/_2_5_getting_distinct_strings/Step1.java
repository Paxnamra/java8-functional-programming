package _2_5_getting_distinct_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
 * The order of elements in the result list may be any. If the input list doesn't contain any strings then the result list should be empty.
 * Hints: it is possible to use sets, maps, lists and so on for helping.
 * Sample Input 1: java scala java clojure clojure || Sample Output 1: clojure java scala
 * Sample Input 2: the three the three the three an an a || Sample Output 2: a an the three
 */

public class Step1 {

    private List<String> listOfStrings = new ArrayList<>(Arrays.asList("java", "scala", "clojure", "clojure", "java", "scala"));

    //way with UnaryOperator
    public static UnaryOperator<List<String>> operator = x -> x.stream().distinct().collect(Collectors.toList());

    public List<String> listInput(UnaryOperator inputFunction) {
        return operator.apply(listOfStrings);
    }

    public static void main(String[] args) {

        //stream way
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("java", "scala", "clojure", "clojure", "java", "scala"));
        System.out.println("Result with stream: " + listOfStrings.stream().distinct().collect(Collectors.toList()));
    }
}
