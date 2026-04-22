import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) throws IOException{
        try{
            FileInputStream f = new FileInputStream("Git.java");
            int i;
            while ((i = f.read())!=-1) {
                System.out.print((char)i);
            }
        }
        catch(FileNotFoundException a)
        {
            System.out.println("File Not Found");
        }
    }
    
}
