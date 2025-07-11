public class challenge7 {
    public static void main(String[] args) {
        //swap 2 number
        int num1 = 23;
        int num2 = 65;
        int temp;

        System.out.println("number before swap");
        System.out.println(num1);
        System.out.println(num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("number after swap");
        System.out.println(num1);
        System.out.println(num2);
    }
}


/*
*
* "C:\Users\IT Tech\.gradle\jdks\eclipse_adoptium-17-amd64-windows.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.1.3\lib\idea_rt.jar=50270" -Dfile.encoding=UTF-8 -classpath "D:\learning intelig\core java\out\production\core java" challenge7
23
65
number after swap
65
23
* */