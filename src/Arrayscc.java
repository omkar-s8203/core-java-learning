import java.util.Scanner;

public class Arrayscc {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println(marks.length);

    }

    public static void arry() {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        System.out.println("enter marks");
        marks[0] = sc.nextInt();  //phy
        marks[1] = sc.nextInt();  //maths
        marks[2] = sc.nextInt();  //chem
        marks[3] = sc.nextInt();  //comp


        System.out.println("Phy marks:" + marks[0]);
        System.out.println("Math marks:" + marks[1]);
        System.out.println("chem marks:" + marks[2]);
        System.out.println("comp marks:" + marks[3]);

        marks[3] = sc.nextInt();
        System.out.println("update marks" + marks[3]);

        int persentage = (marks[0] + marks[1] + marks[2] + marks[3]) / 4;
        System.out.println("persentage:" + persentage);
    }
}
