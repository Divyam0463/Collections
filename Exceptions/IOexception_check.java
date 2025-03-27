import java.io.* ; 

public class IOexception_check {
  public static void main(String[] args) {
    try {
      String filePathName = "data.txt" ; 
      
      FileReader fr = new FileReader(filePathName) ; 
      int data; 
      while((data = fr.read()) != -1){
        System.out.println(data);
      }

      fr.close();
      System.out.println("file read successfully");

    } catch (IOException e) {
      System.err.println("Error: no files found as: "+e.getMessage());
    }
  }
}