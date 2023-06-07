import java.util.Arrays;
import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6);
        odd(array);
    }

    public static void odd (List<Integer> array) {
        for (Integer integer : array) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }
}
