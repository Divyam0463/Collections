import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cnt_words {
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("lorem.txt"));
      HashMap<String, Integer> map = new HashMap<>();

      String line;
      String words[];
      while ((line = reader.readLine()) != null) {
        words = line.toLowerCase().split("\\W+");
        for (String w : words) {
          if (!w.isEmpty()) {
            map.put(w, map.getOrDefault(w, 0) + 1);
          }
        }

        // sorting the hashmap (using the list)
        System.out.println("Top 5 most frequent words: ");
        //first declare a list 
        ArrayList<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet()) ;
        sortedList.sort((a,b) -> b.getValue().compareTo(a.getValue())); //sorted in decending-order

        for(int i = 0 ; i<5 ; i++ ){
          System.out.println(sortedList.get(i).getKey() + " : " + sortedList.get(i).getValue() );
        }

        System.out.println(sortedList);
      }
      reader.close();
      System.out.println("\nfile read successfuly");

    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    }

  }
}
