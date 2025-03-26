import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class image_check {
  public static void checkImage(){
    String inputImagePath = "image.jpg" ; 
    String outputImagePath = "new.jpg" ;
    try { 
      BufferedImage originalImage = ImageIO.read(new File(inputImagePath)) ;   //read the image file
      ByteArrayOutputStream baos = new ByteArrayOutputStream() ; 

      // Convert the image to byte array
      ImageIO.write(originalImage, "jpg", baos) ; 
      byte[] imageBytes = baos.toByteArray() ; //to byte-array
      baos.close();


      //  byte-array to image
      ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes) ;
      BufferedImage newImage = ImageIO.read(bais)  ; 
      bais.close();

      ImageIO.write(newImage, "jpg", new File(outputImagePath)) ; 
      System.out.println("Image successfully converted to the byte array and saved in 'jpg' file: " + outputImagePath);
      
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
  public static void main(String[] args) {
    checkImage();
  }
}
