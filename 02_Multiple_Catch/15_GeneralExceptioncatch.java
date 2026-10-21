
public class GeneralExceptionCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);

        } catch (Exception e) {
            System.out.println("An exception occurred");
            System.out.println("Type: "
                    + e.getClass().getSimpleName());
        }

        System.out.println("Program continues");
    }
}
