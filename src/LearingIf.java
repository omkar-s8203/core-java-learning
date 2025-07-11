public class LearingIf {
    public static void main(String[] args) {
        boolean isMale = false;

        String name = "pranjal";

//        System.out.println("before if else");

        if(isMale){
            System.out.println("Mr. "+name);
        }else {
            System.out.println("Miss. "+name);
        }

//        System.out.println("after if else");


        boolean isSenioreCitizen = false;
        boolean isAdult = false;

        if(isSenioreCitizen){
            System.out.println("hello senior citizen");
        }else {
            if(isAdult){
                System.out.println("hello adult");
            } else {
                System.out.println("hello child");
            }

            boolean isPaid = false;
            boolean isPayLatter = false;

            if(isPaid){
                System.out.println("paid latter");
            }else if(isPayLatter){
                System.out.println("paid latter");
            }else  {
                System.out.println("not paid latter");
            }
        }
    }
}
