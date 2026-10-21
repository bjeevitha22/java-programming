
public class CatchOrderDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught");

        } catch (Exception e) {
            System.out.println("General exception caught");
        }
    }
}
