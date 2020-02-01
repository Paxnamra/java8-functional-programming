package other.interfaces;

@FunctionalInterface
public interface MultiIntFunction {
    long apply(int... args);
}
