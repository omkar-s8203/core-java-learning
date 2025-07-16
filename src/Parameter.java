import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number 1: ");
        int num1 = sc.nextInt();
        System.out.println("enter a number 2: ");
        int num2 = sc.nextInt();
        System.out.println(add(num1, num2));
        System.out.println(add(45,56));
        System.out.println(add(45, 98));

    }

    public static int add(int a, int b){
        System.out.println("first number recived: "+ a);
        System.out.println("second number recived: "+ b);
        int sum = a + b;
        return sum;
    }
}
