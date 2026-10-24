public class FinallyWithNestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try started.");

            try {
                int result = 10 / 0;
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");

            } finally {
                System.out.println("Inner finally executed.");
            }

        } catch (Exception e) {
            System.out.println("Outer catch executed.");

        } finally {
            System.out.println("Outer finally executed.");
        }
    }
}
