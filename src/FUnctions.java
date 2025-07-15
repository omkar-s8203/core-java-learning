public class FUnctions {
    public static void main(String[] args) {
        System.out.println("this is an main function");
        print();
        print2();
    }
    public static void print(){
        System.out.println("this is an print function");
    }

    public static void print2(){
        int rows = 0;
        while(rows < 20000){
            System.out.print("*");

            int cols = 0;
            while (cols < rows){
                System.out.print(" *");
                cols++;
            }
            System.out.println();

            rows++;
        }
    }
}
