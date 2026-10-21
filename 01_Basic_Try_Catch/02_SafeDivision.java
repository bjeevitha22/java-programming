public class SafeDivision {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues");
    }
}
