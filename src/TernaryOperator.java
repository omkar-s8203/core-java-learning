import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TErnary Operator Learning");
        System.out.println("please enter 1st number");
        int num1= input.nextInt();
        System.out.println("please enter 2nd number");
        int num2=input.nextInt();

        String answer = num1 > num2 ? "number 1 is greater" : "number 2 is greater";
        System.out.println(answer);
    }
}
