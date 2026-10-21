//converts text to numbers Integer.parseInt(txt)

public class SafeIntegerParsing {
    public static void main(String[] args) {
        String text = "Java";

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        System.out.println("Program continues");
    }
}
