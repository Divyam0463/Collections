import java.io.* ; 

public class char_read {
  public static void convert2LowerCase(String inputFile , String outputFile , String encoding){
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), encoding)) ;
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), encoding)) ; 
      
      String line ; 
      while ((line = reader.readLine() ) != null) {
        writer.write(line.toLowerCase());
        writer.newLine();
      }

      reader.close(); 
      writer.close();
      System.out.println("File conversion completed.") ;
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    String inputFile = "input.txt";
    String outputFile = "output.txt" ; 
    String encoding = "UTF-8" ; 

    convert2LowerCase(inputFile, outputFile, encoding);
  }
}
