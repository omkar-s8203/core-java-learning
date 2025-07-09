import java.util.Scanner;

public class Challenge5_6 {
    public static void main(String[] args) {

        //create a program to input name of the person and respond with "wlcome {name} to malegaon"
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("welcome "+name + "to omkars world");

        //create program to add two numbers
        System.out.println("enter num 1");
        int num1 = input.nextInt();
        System.out.println("enter num 2");
        int num2=input.nextInt();
        System.out.println(num1+num2);
    }
}
