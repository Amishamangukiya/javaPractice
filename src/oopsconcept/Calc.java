package oopsconcept;

public class Calc {
    int add(int a,int b){
        return a+b;
    }
}
class Calc1 extends Calc{
    int sub(int a,int b){
        return a-b;
    }
}
class Calc2 extends Calc{
    int div(int a,int b){
        return a/b;
    }
}
class Calc3 extends Calc{
    int multi(int a,int b){
        return a*b;
    }
}
class Test{
    public static void main(String[] args) {
        Calc1 x=new Calc1();
        Calc2 y=new Calc2();
        Calc3 z=new Calc3();
        System.out.println(x.sub(9,2));
        System.out.println(y.div(9,3));
        System.out.println(z.multi(5,2));
    }
}
