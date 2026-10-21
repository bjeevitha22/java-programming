public class FinallyWithReturn {

    static int calculate() {
        try {
            System.out.println("Inside try block.");
            return 10;

        } catch (Exception e) {
            System.out.println("Exception caught.");

        } finally {
            System.out.println("Inside finally block.");
        }

        return 0;
    }

    public static void main(String[] args) {
        int result = calculate();
        System.out.println("Returned value: " + result);
    }
}
