package streamGenerate;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerateFun {

    public static void main(String[] args) {

        //just printing integers several times
        Stream.generate(() -> 12345)
                .limit(2)
                .forEach(System.out::print);

        System.out.println();

        //supplier creating 2 random numbers in range 0 to 8
        System.out.println("Ints range up to 8: ");
        Stream.generate(() -> new Random().nextInt(8))
                .limit(2)
                .forEach(System.out::println);

        //supplier creating 2 random numbers in all ints range
        System.out.println("All ints range: ");
        Stream.generate(new Random()::nextInt)
                .limit(2)
                .forEach(System.out::println);

        //IntStream print 3 elements in range
        IntStream someIntStream = new Random().ints(0, 8).limit(3);
        someIntStream.forEach(System.out::println);

        System.out.println();

        //overridden get method in supplier's interface with int
        Stream.generate(new Supplier<Integer>() {
            private int val = 1;

            @Override
            public Integer get() {
                return val++;
            }
        }).parallel()
          .limit(3)
          .forEach(System.out::println);

        System.out.println();

        //overridden get method in supplier's interface with AtomicInteger
        List<Integer> result = Stream.generate(new Supplier<Integer>() {
            private AtomicInteger value = new AtomicInteger();

            @Override
            public Integer get() {
                return value.getAndIncrement();
            }
        }).parallel()
                .peek(System.out::println)
                .limit(4)
                .collect(Collectors.toList());

        System.out.println("results: " + result);
    }
}
