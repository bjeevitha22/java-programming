public class MultipleExceptionScenarios {
    public static void main(String[] args) {
        int choice = 2;

        try {
            if (choice == 1) {
                int result = 10 / 0;
                System.out.println(result);

            } else if (choice == 2) {
                int[] numbers = {10, 20, 30};
                System.out.println(numbers[5]);

            } else {
                int number = Integer.parseInt("Java");
                System.out.println(number);
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        System.out.println("Program continues");
    }
}
