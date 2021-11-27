package week7homework;

public class IfElse {

    public static void compare(int a,int b,int c){
        if (a<b  && a<c){
            System.out.println(a+"  is  child age");

        }
        else if(b<c && c>a){
            System.out.println(b+ "  is healthy man age");

        }
        else {
            System.out.println(c+"  is retired man age");

        }


    }

    public static void main(String[] args) {
        compare(0,20,21);
        compare(18,21,35);
    }
}
