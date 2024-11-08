import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("abcd", "", "bcd", "", "defg", "jk44", " ");
        long num = strList.stream().filter(String::isEmpty).count();
        System.out.println(num);

        long num2 = strList.stream().filter(x -> x.length()>3).count();
        System.out.println(num2);

        List<String> filtered = strList.stream().
                filter(x -> x.length()> 2).collect(Collectors.toList());
        System.out.println(filtered);

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(G7Countries);

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println(stats);
    }
}
