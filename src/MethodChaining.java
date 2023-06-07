public class MethodChaining {
    public static void main(String[] args) {
        //MethodChaining methodChaining = new MethodChaining();
        a1().a2().a3();
    }

    public static MethodChaining a1() {
        System.out.println("a1");
        return new MethodChaining();
    }

    public MethodChaining a2() {
        System.out.println("a2");
        return this;
    }

    public MethodChaining a3() {
        System.out.println("a3");
        return this;
    }
}
