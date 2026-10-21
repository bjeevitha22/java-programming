public class ExceptionMessageDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program continues");
    }
}
