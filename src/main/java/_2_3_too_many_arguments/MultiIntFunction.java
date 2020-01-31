package _2_3_too_many_arguments;

@FunctionalInterface
public interface MultiIntFunction {
    long apply(int... args);
}
