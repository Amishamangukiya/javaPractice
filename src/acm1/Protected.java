package acm1;

public class Protected {
    protected static void multiply(int a,int b){
        int c=a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        multiply(5, 17);
    }
}
