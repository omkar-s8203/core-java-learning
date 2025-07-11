public class UnaryOperators {
    public static void main(String[] args) {
        int a= 54;
//        System.out.println(-a);
//        System.out.println(--a);
//
//        System.out.println(a++);
//        System.out.println(a--);

        System.out.println("watching the increment ");
        System.out.println("A real value is 54 and after post increment a value is"+a++);
        System.out.println("a value is 55 and after pre decrement: "+ ++a);
        System.out.println(a);


        System.out.println("watching the decrement ");
        int b = 5;
        System.out.println(b--);
        System.out.println(b);


    }
}
