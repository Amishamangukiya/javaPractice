package address;

public class PracticeIfElse {
    public static void compare1(int a,int b,int c){
        if(a<=b && b<=c) {
            System.out.println(a + "  is minimum child age");
        }
        else if(b<=c && a<=c){
            System.out.println(b+ " is minimum healthy man age");
        }
        else {
            System.out.println(c+"  is minimum retired man age");

        }
    }

    public static void main(String[] args) {
        compare1(0,21,51);
        compare1(45,75,18);
    }
}
