import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("WElcome to ticket discound calculator");
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your age");
        int age= input.nextInt();
        System.out.println("are you female? (true/fales)");
        boolean isFemale = input.nextBoolean();

        if(age < 5){
            System.out.println("you got 75% disscount");
        }else if(isFemale){
            System.out.println("you got 50% disscount");
        } else if (age>60 && !isFemale) {
            System.out.println("you got 25% disscount");
        }else {
            System.out.println("soory youe are not elibible");
        }
    }
}
