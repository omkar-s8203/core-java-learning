import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=input.nextLine();
        System.out.println("good morning "+ name);
        System.out.println(name + "Also tell me your age");
        int age=input.nextInt();
        System.out.println("ypur age is"+age);

        /*
Enter your name:omkar
good morning omkar
omkarAlso tell me your age
56
ypur age is56*/
    }
}
