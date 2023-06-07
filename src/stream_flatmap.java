import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_flatmap {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");
        Stream<String> stream = stringList.stream();
        stream.flatMap((value) -> {
                    String[] split = value.split(" ");
                    return Arrays.stream(split);
                })
                .forEach(System.out::println);

        String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
