public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int[] arr = {1, 2};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        }
    }
}
