import java.util.*;
public class Main{
    public static void main(String args[]){
        try{
            int []arr={1,2,3};
            System.out.println(arr[5]);
        }
        catch(ArithmeticException |ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid operations");
        }
    }
}
