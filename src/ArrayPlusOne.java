import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayPlusOne {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(3, 5, 7, 9)
                .map(t -> t + 1)
                .collect(Collectors.toList());
        System.out.println(list);

        List<Integer> list2 = Arrays.asList(3, 5, 7, 9);
        System.out.println(list2);
        for (int i=0; i<list2.size(); i++) {
            list2.set(i, list2.get(i) + 1);
        }
        //list2.replaceAll(integer -> integer + 1);
        System.out.println(list2);
    }
}


