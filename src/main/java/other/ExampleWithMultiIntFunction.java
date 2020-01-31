package other;

import other.interfaces.MultiIntFunction;

import java.util.Arrays;

public class ExampleWithMultiIntFunction {

    //experiment with ints
    public MultiIntFunction sumOfInts = (int... i) -> Arrays.stream(i).sum();

    public static void main(String[] args) {

        ExampleWithMultiIntFunction example = new ExampleWithMultiIntFunction();
        int[] inputData = new int[]{1, 2, 3, 4};

        System.out.println(example.sumOfInts.apply(inputData));
    }
}
