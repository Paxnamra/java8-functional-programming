package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatListElementsWithConsumer {
    public static void main(String[] args) {
        List<String> listOfThings = new ArrayList<>(Arrays.asList("blob", "parallel", "concurrency", "database", "connector", "pattern", "derp"));

        listOfThings.forEach(value -> {
            String concat = value.concat("").toUpperCase();
            System.out.println(concat);
        });
    }
}
