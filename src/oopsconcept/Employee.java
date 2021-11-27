package oopsconcept;

public class Employee {
    int id;
    String name;
    int age;
    Employee(int i,String n){
        id=i;
        name=n;

    }
    Employee(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Employee e1=new Employee(234, "John");
        Employee e2=new Employee(235,"Neha",30);
        e1.display();
        e2.display();
    }
}
