import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Map.Entry.comparingByValue;

public class MapSortedKeys {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("question1","1");
        map.put("question9","3");
        map.put("question2","4");
        map.put("question5","2");

        TreeMap<String, String> tree = new TreeMap<>(map);
        for(Map.Entry<String, String> entry : tree.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getValue)
                .forEach(System.out::println);

        map.entrySet().stream()
                .sorted(comparingByValue())
                .forEach(System.out::println);

    }
}