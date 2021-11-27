package class11hw;

public class TestThrow2 {
    public static void checkEligibility(int personage,int personweight){
        if (personage<18 && personweight<70){
         throw new ArithmeticException("Person is not eligible for blood donation");
        }
        else {
            System.out.println("Person is eligible for blood donation");
        }

    }

    public static void main(String[] args) {
        checkEligibility(20,55);
    }
}
