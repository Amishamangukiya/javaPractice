package week7hw;

public class ForLoop2 {
    public static void add(int start,int end){
        int result=0;
        for (int x=start;x<=end;x++){
            result=result+x;

        }
        System.out.println("sum of "+start+" to "+end+" is "+result);
    }

    public static void main(String[] args) {
        add(0,50);
    }
}
