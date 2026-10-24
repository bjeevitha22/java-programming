public class FinallyWithMethodCalls {

    static void display() {
        try {
            System.out.println("Display method executed.");
            int result = 10 / 2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");

        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {
        display();
        System.out.println("Back to main method.");
    }
}
