package usa_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 1, 11));
        int min = array.get(0);
        int max = array.get(0);
        for(int i=0; i<array.size(); i++) {
            if(min > array.get(i)) min = array.get(i);
            if(max < array.get(i)) max = array.get(i);
        }
        System.out.println("min = " + min + "\nmax = " + max);

        int max2 = array.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("List is empty"));

        System.out.println(max2);


        String[] rates = {"$123", "USD456"};
        String[] numeric = new String[rates.length];

        for(int i=0; i<rates.length; i++) {
            numeric[i] = rates[i].replaceAll("\\D+", "");
        }

        Pattern pattern = Pattern.compile("\\D+");

        String[] numeric2 = Arrays.stream(rates).map(rate -> pattern.matcher(rate)
                .replaceAll("")).toArray(String[]::new);

        System.out.println(Arrays.toString(numeric));
    }
}
