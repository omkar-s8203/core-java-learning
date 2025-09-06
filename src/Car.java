public class Car {

    int noOfWhells;
    String color = "black";
    float maxSpeed;
    float currentFuleInLiters= 56.2f;

    public void drive(){
        System.out.println("car is driving");
    }

    public void addFule(float fuleInLiters){
         currentFuleInLiters += fuleInLiters;
    }

    public void getcurrentFuleInLiters(){
        System.out.println("Current Fule In Liters: " + currentFuleInLiters);
    }

}
