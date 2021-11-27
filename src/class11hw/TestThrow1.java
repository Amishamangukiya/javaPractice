package class11hw;

public class TestThrow1 {
    public static void div(){
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        div();
    }
}
