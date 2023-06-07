import java.util.HashSet;
import java.util.Set;

public class HasSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dima");
        set.add("Yana");
        set.add("Richard");

        for (String s : set) {
            if(s.contains("Dima"))
                System.out.println(s);
        }

        System.out.println(set.stream().anyMatch(s -> s.equals("Dima")));
    }
}