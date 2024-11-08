package usa_prep;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SelectNumeric {
    public static void main(String[] args) {
        String[] rates = {"$123", "USD456"};
        String[] numeric = new String[rates.length];
        for(int i=0; i<rates.length; i++) {
            numeric[i] = rates[i].substring(rates[i].length() - 3);
        }

        Pattern pattern = Pattern.compile("\\D+");

        String[] numeric2 = Arrays.stream(rates)
                .map(rate -> pattern.matcher(rate).replaceAll(""))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(numeric));
        System.out.println(Arrays.toString(numeric2));

        int[] array = {55, 2, 5, 11, 3, 5, 66};
        int min = array[0];
        int max = array[0];
        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max number = " + max);
        System.out.println("Min number = " + min);

        int min2 = Arrays.stream(array).min().getAsInt();
        int max2 = Arrays.stream(array).max().getAsInt();

        System.out.println("Max number2 = " + max2);
        System.out.println("Min number2 = " + min2);
    }
}