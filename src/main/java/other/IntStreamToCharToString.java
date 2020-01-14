package other;

import java.util.stream.IntStream;

public class IntStreamToCharToString {
    public static void main(String[] args) {

        //Integers to chars and to String as numbers

        IntStream stream = "aibohphobia".chars();
        IntStream stream2 = "aibohphobia".chars();

        String result = stream2.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

        String result2 = stream.collect(StringBuilder::new,
                (sb, s1) -> sb.append(s1).append(" "),
                (sb1, sb2) -> sb1.append(sb2.toString())).toString();

        System.out.println(result);
        System.out.println("--------");
        System.out.println(result2);
    }
}
