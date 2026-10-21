public class ExceptionClassNameDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception type: "
                    + e.getClass().getSimpleName());
            System.out.println("Exception message: "
                    + e.getMessage());
        }

        System.out.println("Program continues");
    }
}

/*
Code	                             Result
e.getClass()	                Class information
e.getClass().getSimpleName()	ArithmeticException
e.getMessage()	                / by zero
*/
