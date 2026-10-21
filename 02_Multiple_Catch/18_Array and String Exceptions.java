public class ArrayAndStringExceptions {
    public static void main(String[] args) {
        int choice = 1;

        try {
            if (choice == 1) {
                int[] numbers = {10, 20, 30};
                System.out.println(numbers[5]);
            } else {
                String text = "Java";
                System.out.println(text.charAt(6));
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid string index");
        }
    }
}
