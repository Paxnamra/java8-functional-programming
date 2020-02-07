package jetBrains_academy;

import java.util.*;
import java.util.function.*;

/**
 * It is always nice to have one function that can sort array both ascending and descending. This function is implemented below and based on bubble sorting algorithm.
 * The function takes 2 parameters - array and comparison function.
 * The comparison function should take 2 parameters and return the minimum of the two if the array should be sorted in the ascending order,
 * and the maximum of the two if the array should be sorted in the descending order.
 */

public class AscDescSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAscending = scanner.nextLine().equals("ascending");
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        BiFunction<Integer, Integer, Integer> comparator = isAscending ? Math::min : Math::max;

        sort(array, comparator);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static void sort(int[] array, BiFunction<Integer, Integer, Integer> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.apply(array[j], array[j + 1]) == array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
