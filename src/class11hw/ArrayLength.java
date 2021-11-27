package class11hw;

public class ArrayLength {
    public static void main(String[] args) {
        int[] arr=new int[]{7,17,27,37,47};
        int arrayLength=arr.length;
        System.out.println("The length of the array is:"+arr.length);
        System.out.println("Original array:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Array in reverse order:");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
