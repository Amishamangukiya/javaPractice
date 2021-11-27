package week6homework;

public class VariableType1 {

    static int a = 5;
    static int b =10;
    static int c =15;

    public static void add(){
        int total =a+b+c;
        System.out.println(total);

    }
    public static void sub(){
        int sub = c-b;
        System.out.println(sub);
    }

    public static void main(String[] args) {
        add();
        sub();
    }
}
