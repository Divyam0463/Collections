import java.util.InputMismatchException;
import java.util.Scanner;

public class runtime_exception {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    try {
      System.out.println("input Integer: ");
      int inp = s.nextInt() ; 

      int num = 10/0 ; 
      System.out.println(num);
      
      System.out.println("ran properly");

    } catch (ArithmeticException e) {
      System.err.println("there is some mistake in mathematical operations: "+e.getMessage()) ; 
    }
    catch(InputMismatchException e){
      System.err.println("input-type is wrong: "+e.getMessage());
    }
  }
}
