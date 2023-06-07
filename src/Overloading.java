public class Overloading {

    static class A {
        String property = "This is A";

        void print() {
            System.out.println("This is A method");
        }
    }

    static class B extends A {
        String property = "This is B";

        void print() {
            System.out.println("This is B method");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.print();

        A b1 = new B();
        b1.print();
        System.out.println(b1.property);

        B b2 = new B();
        b2.print();
        System.out.println(b2.property);
    }
}

