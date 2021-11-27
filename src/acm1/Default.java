package acm1;

public class Default {
     void div(int a,int b){
        int c=a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Default div1=new Default();
        div1.div(10,5);
    }

}
