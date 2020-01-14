package other;

import java.util.stream.IntStream;

public class IntStreamToCharToString {
    public static void main(String[] args) {

        //Integers to chars and to String as numbers

        IntStream stream = "aibohphobia".chars();
        String result = stream.map(Character::getNumericValue).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

        System.out.println(result);
    }
}
