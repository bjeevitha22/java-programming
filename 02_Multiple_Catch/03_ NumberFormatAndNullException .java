public class NumberFormatAndNullException {
    public static void main(String[] args) {
        String text = "Java";

        try {
            int number = Integer.parseInt(text);
            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");

        } catch (NullPointerException e) {
            System.out.println("String reference is null");
        }

        System.out.println("Program continues");
    }
}
