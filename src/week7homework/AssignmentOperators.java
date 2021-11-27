package week7homework;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a=6;
        System.out.println(a);
        System.out.println(a+=5); //6 + 5=11
        System.out.println(a-=2); //11 - 2=9
        System.out.println(a*=7); //9 * 7=63
        System.out.println(a/=2); //63 / 2=31
        System.out.println(a%=5); //31 % 5=1
        System.out.println(a&=3); //1 & 3=1
    }
}
