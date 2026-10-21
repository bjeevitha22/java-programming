public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;

        try {
            int result = a % b;
            System.out.println("Remainder: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred");
        }

        System.out.println("Program completed");
    }
}
