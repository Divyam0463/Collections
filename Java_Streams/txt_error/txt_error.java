import java.io.*;

public class txt_error {
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt"), "UTF-8")) ;

      String line;
      while ((line = reader.readLine()) != null) {
        if (line.toLowerCase().contains("error")) {
          System.out.println(line);
        }
      }
      reader.close();

      System.out.println("\nFile read successfully");
    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
