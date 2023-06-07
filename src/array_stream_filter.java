import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://highload.today/java-stream-api/
public class array_stream_filter {
    public static void main(String[] args) {
        String[] arr = { "NYC", "Mexico", "Beijing", "New Delhi", "Tokyo" };
        Stream<String> stream = Arrays.stream(arr);
        stream.filter(s -> s.startsWith("N")).forEach(System.out::println);

        Stream<String> stream2 = Stream.of("NYC", "Mexico", "Beijing", "New Delhi", "Tokyo");
        String[] str = stream2.collect(Collectors.toList()).toArray(new String[0]);
        System.out.println(Arrays.toString(str));

        Collection<Integer> collection = Arrays.asList(5, 6, 8, 9, 13);
        Integer odd = collection.stream().filter(p -> p % 2 != 0).reduce((c1, c2) -> c1 + c2).orElse(0); //Integer::sum
        System.out.println(odd);

        Stream.of("3", "4", "5").map(Integer::parseInt).map(x -> x + 10).forEach(System.out::println);
    }
}