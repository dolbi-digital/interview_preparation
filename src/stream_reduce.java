import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_reduce {
    public static void main(String [] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbers
                .stream().reduce((a,b) -> a + b).get();
        System.out.println(result);

        List<String> letters = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
        String result2 = letters
                .stream()
                .reduce("", (a, b) -> a + b);
        System.out.println(result2);

        numbers.stream().map(i -> i * 2).forEach(System.out::println);

        for(String s: letters) {
            char[] array = s.toCharArray();
            for(int i=0; i<array.length; i++) {
                array[i] = Character.toUpperCase(array[i]);
            }
            System.out.println(array);
        }

        letters.stream().map(String::toUpperCase).forEach(System.out::println);

        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted()
                .forEach(System.out::println);
    }
}
