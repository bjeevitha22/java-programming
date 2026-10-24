public class FinallyCleanupDemo {
    public static void main(String[] args) {
        int number = 100;

        try {
            System.out.println("Number: " + number);
            int result = number / 5;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");

        } finally {
            System.out.println("Cleanup completed.");
        }
    }
}
