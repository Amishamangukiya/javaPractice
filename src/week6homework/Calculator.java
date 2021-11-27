package week6homework;

public class Calculator {
    public static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }

    public static void sub(int x,int y){
        int z=x+y;
        System.out.println(z);
    }

    public static void multiply(int num1,int num2){
        int total=num1*num2;
        System.out.println(total);
    }

    public static void div(int d,int e){
        int A=d/e;
        System.out.println(A);
    }

    public static void main(String[] args) {
        add(6,7);
        sub(23,11);
        multiply(12,12);
        div(90,10);
    }

}
