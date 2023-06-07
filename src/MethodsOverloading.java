public class MethodsOverloading {
    public static void main(String[] args) {
        math();
        System.out.println(math(3, 5));
        System.out.println(math(3.3, 5));
        System.out.println(math(3, 5.9));
        System.out.println(math(3.3, 5.2));
    }

    public static void math() {
        System.out.println("Empty");
    }

    public static int math(int a, int b) {
        return a + b;
    }

    public static int math(double a, int b) {
        return (int) (a + b);
    }

    public static int math(int a, double b) {
        return (int) (a + b);
    }

    public static double math(double a, double b) {
        return (a + b);
    }
}
