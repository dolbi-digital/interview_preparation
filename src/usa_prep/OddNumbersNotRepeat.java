package usa_prep;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddNumbersNotRepeat {
    public static void main(String[] args) {
        int[] arr = {2,3,3,7,13,6,13,12,7};
        odd(arr);
    }

    public static void odd(int[] array) {
        List<Integer> odd = new ArrayList<>();
        for (int i : array) {
            if (i % 2 != 0) {
                odd.add(i);
            }
        }

        HashSet<Integer> set = new HashSet<>(odd);
        System.out.println(set);
        List<Integer> newOdd = new ArrayList<>(set);
        Collections.sort(newOdd);
        System.out.println(newOdd);

        odd.stream().distinct().sorted().forEach(System.out::print);
    }
}