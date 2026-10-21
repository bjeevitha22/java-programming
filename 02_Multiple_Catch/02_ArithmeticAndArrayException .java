public class ArithmeticAndArrayException {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            int result = 10 / 0;
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        System.out.println("Program continues");
    }
}
