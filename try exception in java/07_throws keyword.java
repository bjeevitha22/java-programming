import java.util.*;
public class Main{
    static void readFile() throws IOException{
        FileReader file=new FileReader("data.txt");
        file.close();
    }
    public static void main(String args[]){
        try{
            readFile();
        }
        catch(IOException e){
            System.out.println("File handling error");
        }
    }
}
