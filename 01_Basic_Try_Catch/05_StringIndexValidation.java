public class StringIndexValidation {
    public static void main(String[] args) {
        String text = "Java";

        try {
            char ch = text.charAt(6);
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid string index");
        }

        System.out.println("Program continues");
    }
}
