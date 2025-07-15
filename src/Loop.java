import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i =1;           //initialization
        while (i <=100){     //condition
            System.out.println(i);  // actual work
            i = i+1;                //updating the condition
        }


        //reverse counting
        int a =500;

        while (a >= 200){
            System.out.println(a);
            a = a-1;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int b= 0;
        while (b < 5){
            int inp = sc.nextInt();
            System.out.println("number is: "+inp);
            b++;
        }
    }
}
