package oopsconcept;

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

public class Multification {
    static int multi(int a,int b){
        return a*b;
    }
    static double multi(double a,double b){
        return a*b;
    }
}
class Overloading{
    public static void main(String[] args) {
        System.out.println(Multification.multi(9,8));
        System.out.println(Multification.multi(1.2,1.3));
    }
}