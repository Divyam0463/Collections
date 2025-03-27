import java.io.* ;

public class try_withResources {
  public static void main(String[] args) {
    String fileName = "try_withResources/info.txt" ; 

    try {
      BufferedReader reader = new BufferedReader(new FileReader(fileName)) ; 
      String line ; 

      while((line = reader.readLine()) != null){
        System.out.println(line);
        break ; 
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
