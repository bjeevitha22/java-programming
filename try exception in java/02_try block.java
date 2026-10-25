import java.util.*;
public class Main{
    public static void main(String args[]){
        try{  
            int a=10;
            int b=0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divided by zero");
        } 
    }
}
