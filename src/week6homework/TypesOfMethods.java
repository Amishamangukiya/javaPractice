package week6homework;

public class TypesOfMethods {

    // void type method
    public static void myMethod(String name,int age){
        System.out.println(name +age);

    }
    //return type method
    public static int myMethod1(int x,int y){
        return x+y;

    }

    //with parameter method
    public static void sub(int a,int b){
       int c=a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        myMethod("amisha",9);
        System.out.println(myMethod1(5,8));
        sub(8,4);
    }
    }



