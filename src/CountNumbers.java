import java.util.HashMap;
import java.util.Map;

public class CountNumbers {
    public static void main(String[] args) {
        int[] array = {2, 4, 2, 7, 8, 7, 2, 2, 2, 4, 4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                int count = map.get(j);
                map.put(j, count + 1);
            }
        }
        System.out.println(map);

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }

        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
