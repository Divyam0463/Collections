import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class buffered_copy {
  private static final int BUFFER_SIZE = 4096; // 4 KB buffer (for reading purposes)

  public static void main(String[] args) {
    System.gc() ; 
    Long beginningTime = System.nanoTime();
    try {
      BufferedInputStream bi = new BufferedInputStream(new FileInputStream("hello.txt"), BUFFER_SIZE);
      BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("headTo.txt"), BUFFER_SIZE);

      byte[] buffer = new byte[BUFFER_SIZE];
      int byteData;
      while ((byteData = bi.read(buffer)) != -1) {
        bo.write(buffer, 0, byteData);
      }

      Long endingTime = System.nanoTime();

      System.out.println("File written successfully");
      System.out.println("Buffered Time-taken: (in ms) " + (endingTime - beginningTime) / 1_00_000);

    } catch (IOException e) {
      e.printStackTrace();
    }
    try

    {
      System.gc() ; // to reduce GC effects  
      Long startTimeUnbuffered = System.nanoTime() ;
      FileInputStream fis = new FileInputStream("hello.txt");
      FileOutputStream fos = new FileOutputStream("fileOutputHello.txt");
      int byteData;

      while ((byteData = fis.read()) != -1) { // Reads and writes byte by byte (slow) 
        fos.write(byteData);
      }

      System.out.println("\nFile read successfully.");
      System.out.println("Unbuffered Time-Taken: " + (System.nanoTime() - startTimeUnbuffered)/1_00_000);
    } catch (IOException e) {
      System.out.println("Error: Input is of wrong type");
    }
  }
}
