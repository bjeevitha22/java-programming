import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInputExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            System.out.println("Result: " + (a / b));

        } catch (InputMismatchException e) {
            System.out.println("Please enter integers only");

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            sc.close();
        }
    }
}
