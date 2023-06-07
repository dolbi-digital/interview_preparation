import java.util.*;

public class Subscription {
    public static void main(String[] args) {
        List<HashMap> list = new ArrayList<>();
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Dima", "A");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Dima", "B");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("Yana", "A");
        HashMap<String, String> map4 = new HashMap<>();
        map4.put("Richard", "A");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);

        List<Set> names = new ArrayList<>();

        HashSet<String> set = new HashSet();


        for(HashMap map : list) {
            System.out.println(map.keySet());
            names.add(map.keySet());
        }

        System.out.println(names);
    }
}
