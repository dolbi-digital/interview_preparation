public class MethodsHiding {
        public static void method1()
        {
            System.out.println("Method-1 of the Demo class is executed.");
        }
        public void method2()
        {
            System.out.println("Method-2 of the Demo class is executed.");
        }
    }
    class Sample extends MethodsHiding
    {
        public static void method1()
        {
            System.out.println("Method-1 of the Sample class is executed.");
        }
        public void method2()
        {
            System.out.println("Method-2 of the Sample class is executed.");
        }
        public static void main(String args[])
        {
            MethodsHiding d1 = new MethodsHiding();
//d2 is reference variable of class Demo that points to object of class Sample
            MethodsHiding d2 = new Sample();
//method calling with reference (method hiding)
            d1.method1();
            d2.method1();
//method calling with object (method overriding)
            d1.method2();
            d2.method2();
    }
}
