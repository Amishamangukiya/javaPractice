package class11hw;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr=new int[]{2,12,22,32};
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of all the no in array:"+sum);
    }
}
