package Module5;

 public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

