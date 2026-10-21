public class SpecificAndGeneralCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Specific catch: Invalid array index");

        } catch (Exception e) {
            System.out.println("General catch: An error occurred");
        }
    }
}
