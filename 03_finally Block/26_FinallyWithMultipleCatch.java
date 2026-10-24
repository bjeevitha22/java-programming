public class FinallyWithMultipleCatch {
    public static void main(String[] args) {
        int choice = 1;

        try {
            if (choice == 1) {
                int result = 10 / 0;
                System.out.println(result);
            } else {
                int[] numbers = {10, 20, 30};
                System.out.println(numbers[5]);
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");

        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
