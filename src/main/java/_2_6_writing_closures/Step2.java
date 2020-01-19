package _2_6_writing_closures;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Step2 {
    public static void main(String[] args) {

//        Using closure write a lambda expression that adds prefix (before) and suffix (after) to its single string argument;
//        prefix and suffix are final variables and will be available in the context during testing.
//        All whitespaces on the both ends of the argument must be removed. Do not trim prefix, suffix and the result string.

        final String prefix = "Ciastko";
        final String suffix = "Wafelek";

        UnaryOperator<String> unaryString = s -> {
            String modified = prefix + s.trim() + suffix;
            return modified.trim();
        };

        UnaryOperator<String> unary = s -> {
            return prefix + s.trim() + suffix;
        };

        UnaryOperator<String> u = s -> prefix + s.trim() + suffix;

        Consumer<String> consumerStr = cs ->
                System.out.println(prefix + cs.trim() + suffix);

        //unaryOperators
        System.out.println(unaryString.apply("<3"));
        System.out.println(unary.apply("D:"));
        System.out.println(u.apply("^^"));
        //same print result with consumer
        consumerStr.accept("<<Cookie>>");
    }
}
