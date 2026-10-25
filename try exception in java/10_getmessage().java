public class Main {
    public static void main(String[] args) {
        Exception e = new Exception("File not found");
        System.out.println(e.getMessage());
    }
}

/*
new Exception("File not found") - Stores the message
e.getMessage() - retrieves the message
Systen.out.println() - displays 
*/
