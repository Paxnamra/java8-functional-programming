package _2_3_too_many_arguments;

import java.util.Arrays;

//Write a lambda expression that accepts seven (!) string arguments and returns a string in upper case concatenated from all of them (in the order of arguments).
//Note. The correct solution may not work in your local environment because you don't have suitable functional interface.
// The testing system has the interface and can test your solution.

public class Step1 {

    @FunctionalInterface
    public interface ManyArguments {
        int concat(int a, int b, int c, int d, int e, int f, int g);
    }

    public static void main(String[] args) {

        String input = "The lambda has too many arguments";
        System.out.println(Arrays.stream(input.split(" ")).reduce("", (s1, s2) -> s1 + s2).toUpperCase());
    }
}

