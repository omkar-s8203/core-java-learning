public class ArrayAsArgument {
    public static void main(String[] args) {
        int marks[] = {94,48,99};

        System.out.println("marks before update");
        for(int i=0; i<marks.length; i++){
            System.out.print(" "+marks[i]);
        }
        System.out.println();
        System.out.println("marks after update");
        update(marks);
    }

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
            System.out.print(" "+marks[i]);
        }


    }
}
