
public class MultiCatchIntroduction {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        String text = "Java";
        int choice = 1;

        try {
            if (choice == 1) {
                System.out.println(10 / 0);
            } else {
                System.out.println(text.charAt(8));
            }

        } catch (ArithmeticException | StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled: " + e.getClass().getSimpleName());
        }

        System.out.println("Program continues.");
    }
}
