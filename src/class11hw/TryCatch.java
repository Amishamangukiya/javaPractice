package class11hw;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers={6,16,26};
            System.out.println(numbers[2]);
            System.out.println(numbers[5]);
        } catch (Exception e){
            System.out.println("Type of Exception");
            System.out.println("Element 5:"+e);
        }
    }
}
