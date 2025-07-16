import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        System.out.println("The sum is: " + calculate());
    }

    public static void greet(){
        System.out.println("welcome to calulator");
    }

    public static int calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int a = sc.nextInt();
        System.out.println("Enter number B: ");
        int b = sc.nextInt();
        return a+b;
    }
}
