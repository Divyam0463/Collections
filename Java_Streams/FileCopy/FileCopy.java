
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "hello.txt" ; 
        String destinationFile = "destination.txt" ; 

        try {
            FileInputStream fis = new FileInputStream(sourceFile) ;
            FileOutputStream fos = new FileOutputStream(destinationFile) ;
            int byteData ; 

            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File read successfully.");
        } 
        catch (IOException e) {
            System.out.println("Error: Input is of wrong type");
        }
    }
}
