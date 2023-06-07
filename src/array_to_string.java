import java.util.Arrays;

public class array_to_string {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"One", "Two", "Three", "four", "Five"};
        String arrayToString = String.join("/", arrayOfStrings); //Arrays.stream(arrayOfStrings).collect(Collectors.joining());
        System.out.println(arrayToString);

        String arrayToString2 = Arrays.toString(arrayOfStrings);
        System.out.println(arrayToString2);
    }
}