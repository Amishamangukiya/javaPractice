package class11hw;

public class LargestNo {
    public static void main(String[] args) {
        int[] arr=new int[]{23,56,12,67,9};
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest no in given array:"+max);
    }
}
