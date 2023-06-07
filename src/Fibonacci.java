public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(getFibonacci(9));
    }

    private static int fibonacci(int n)  {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number!");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    private static long getFibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        int x = 0, y = 1;
        int ans = 0;
        for(int i = 1; i < n; i++) {
            ans = x + y;
            x = y;
            y = ans;
            System.out.println(ans);
        }
        return ans;
    }
}