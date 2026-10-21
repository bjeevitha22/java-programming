public class FinallyAfterSuccessfulTry {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 4;
            int result = a / b;

            System.out.println("Division successful.");
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred.");

        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program completed.");
    }
}
