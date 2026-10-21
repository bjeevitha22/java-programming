
public class NullReferenceCheck {
    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("String reference is null");
        }

        System.out.println("Program continues");
    }
}
