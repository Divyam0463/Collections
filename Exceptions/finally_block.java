import java.util.Scanner;

public class finally_block {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ; 
    try {
      System.out.println("Input numbers: ");
      int nume = sc.nextInt() ; 
      int deno = sc.nextInt() ; 

      int ans = nume/deno  ; 
      System.out.println("answer to the problem is : "+ans);
    } catch (ArithmeticException e) {
      System.err.println("Error: "+e.getMessage());
    }finally{
      System.out.println("Operation completed");
    }
  }
}
