package oopsconcept;

public class Vehicle {
    void brand(){
        System.out.println("toyota");
    }
}
class Car extends Vehicle{
    void brand(){
        System.out.println("ford");}
    void color(){
            System.out.println("red");}
    void name(){
        super.brand();
        color();
    }
    }
    class TestSuper{
        public static void main(String[] args) {
            Car c=new Car();
            c.name();
        }


    }

