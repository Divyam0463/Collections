
import java.io.*;

public class UserInfoToFile {
    public static void main(String[] args) {
        // user info will be saved
        String fileName = "user_info.txt";

        try {
            // Using BufferedReader to get user input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter(fileName, true); // Append mode enabled

            System.out.println("Enter yr name : ");
            String name = br.readLine() ; 

            System.out.println("Enter yr age : ");
            int age = Integer.parseInt(br.readLine()) ; 

            System.out.println("Enter yr fav programming language : ");
            String language = br.readLine() ; 

            fw.write("Name: "+name);
            fw.write("\nAge: "+age);
            fw.write("\nFav language: "+language); // write all of them in the user_info.txt

            fw.write("\n--------------------------------");
            fw.close();

            System.out.println("File written successfully " + fileName);

        } catch (NumberFormatException e) {
            System.err.println("error: age input is not correct");
        }
        catch(IOException e){
            System.err.println("error: input is not right"+e.getMessage());;
        }

    }
}
