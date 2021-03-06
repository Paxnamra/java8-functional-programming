package _2_19_numbers_filtering;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//        You have two IntStream. The first stream contains even numbers and the second stream contains odd numbers.
//        Create the third stream that contains numbers from both streams which is divisible by 3 and 5.
//        After calling collect(Collectors.toList()) the stream should return sorted list (ascending) of these numbers.
//        Two first suitable numbers in the sorted list must be skipped.

public class Step1 {
    public static void main(String[] args) {

        //several streams because they close after they end and are not reusable
        IntStream example1 = IntStream.of(30, 90, 40, 21, 120);
        IntStream example2 = IntStream.of(60, 75, 13, 2);
        IntStream example3 = IntStream.of(30, 90, 40, 21, 120);
        IntStream example4 = IntStream.of(60, 75, 13, 2);

        List<Integer> passedStream = createFilteringStream1(example1, example2).boxed().collect(Collectors.toList());
        System.out.println(passedStream.stream().sorted().skip(2).collect(Collectors.toList()));

        System.out.println(createFilteringStream2(example3, example4).boxed().collect(Collectors.toList()));
    }

    public static IntStream createFilteringStream1(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(oddStream, evenStream)
                .filter(i -> i % 3 == 0 &&
                        i % 5 == 0);
    }

    public static IntStream createFilteringStream2(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(oddStream, evenStream)
                .filter(i -> i % 3 == 0 && i % 5 == 0)
                .boxed()
                .sorted()
                .skip(2)
                .mapToInt(p -> p);
    }
}
