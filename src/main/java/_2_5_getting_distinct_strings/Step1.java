package _2_5_getting_distinct_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Step1 {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("java", "scala", "clojure", "clojure", "java", "scala"));

        System.out.println(listOfStrings.stream().distinct().collect(Collectors.toList()));
    }
}
