package oopsconcept;

public class Shape {
    void square(){
        System.out.println("four sides");
    }
}
class Figure1 extends Shape{
    void triangle(){
        System.out.println("three sides");
    }
}
class Figure2 extends Figure1{
    void hexagon(){
        System.out.println("six side");
    }
}
class inheritance{
    public static void main(String[] args) {
        Figure2 f=new Figure2();
        f.square();
        f.triangle();
        f.hexagon();
    }
}
