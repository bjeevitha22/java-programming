
public class MultipleStatementsInTry {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 0;

            System.out.println("Before division");

            int result = a / b;

            System.out.println("Result: " + result);
            System.out.println("After division");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues");
    }
}
