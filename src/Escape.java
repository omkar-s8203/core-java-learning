public class Escape {
    public static void main(String[] args) {
//        System.out.println("Hello "World" ");  java: ')' expected
        System.out.println("Hello \"World\"...");   //Hello "World"...
        System.out.println("Hello \\World\\...");   //Hello \World\...
        System.out.println("Hello \nworld\n "); /*Hello
                                                 world*/
        System.out.println("hello \tomkar\t");  //hello 	omkar

    }
}
