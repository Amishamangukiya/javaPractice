package oopsconcept;

public class Rectangle {
    int l;
    int h;
}
class AreaOfRectangle1{
    public static void main(String[] args) {
        int a1;
        Rectangle rectangle=new Rectangle();
        rectangle.l=20;
        rectangle.h=40;
        a1= rectangle.l* rectangle.h;
        System.out.println("Area of Rectangle1 of is:" +a1);

    }


}
class AreaOfRect2 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        int a2;
        rectangle1.l = 15;
        rectangle1.h = 25;
        a2=rectangle1.l* rectangle1.h;
        System.out.println("Area of Rectangle2 of is:" +a2);
    }
}




