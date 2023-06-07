public class StaticMethods {

        public static void main(String[] args) {
            A b = new B();
            b.printMe();
            System.out.println(b.string);
            System.out.println(b.n);
        }

    }

    class A {
        String string = "A";
        int n = 1;
        void printMe() {
            System.out.println("In static A");
        }
    }

    class B extends A {
        String string = "B";
        int n = 2;
        void printMe() {
            System.out.println("in static B");
        }
    }
