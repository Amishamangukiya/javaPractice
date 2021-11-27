package class11hw;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

public class SmallestNo {
    public static void main(String[] args) {
        int[] arr=new int[]{27,12,6,35,57};
        int min=arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Smallest no in given array:"+min);
    }
}
