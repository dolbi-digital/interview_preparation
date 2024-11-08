import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class array_max {
    public static void main(String[] args) {
        int [] array = {3,4,6,3,2,8,9};
        int sum = 0;

        for(int i=0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum);

        int sumStream = IntStream.of(array).sum(); //int sum = Arrays.stream(A).sum();
        System.out.println(sumStream);

        int sum2 = Arrays.stream(array).reduce((x, y) -> x + y).getAsInt(); //reduce(Integer::sum).getAsInt();
        System.out.println(sum2 + " reduce");

        int max = 0;
        for(int i=0; i < array.length; i++) {
            if(max<array[i]) max=array[i];
        }
        System.out.println(max);

        OptionalInt maxStream = Arrays.stream(array).max();
        System.out.println(maxStream.getAsInt());
    }
}