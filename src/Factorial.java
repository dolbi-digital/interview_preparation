import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factorial {
    private static int getFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i++){
            result *= i;
        }
        return result;
    }

    private static int getFactorial2(int n){
        if(n <= 1) {
            return 1;
        } else {
            return n * getFactorial2(n - 1);
        }

    }
    private static int getFactorial3(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return IntStream.rangeClosed(2, n).reduce((x, y) -> x * y).getAsInt();
        }
    }

    public static void main(String[] args){
        System.out.println(getFactorial(5));
        System.out.println(getFactorial2(4));
        System.out.println(getFactorial3(5));

        IntStream.rangeClosed(-4, 3).forEach(System.out::println);
    }
}