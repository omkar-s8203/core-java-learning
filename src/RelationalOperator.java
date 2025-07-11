import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to driving licence portal");
        System.out.println("please enter your age");
        int age = input.nextInt();

        if(age >=18){
            System.out.println("you are eligible to drive");
        }else{
            System.out.println("you are not eligible to drive");
        }
    }
}
