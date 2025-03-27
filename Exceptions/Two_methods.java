import java.util.Scanner;

public class Two_methods {
  public static void method1(){
    Scanner sc = new Scanner(System.in) ; 
    try {
      System.out.println("Enter two numbers: ");
      int num1 = sc.nextInt() ; 
      int num2 = sc.nextInt() ; 
      System.out.println("ans: " + num1/num2);

    } catch (ArithmeticException e) {
      System.err.println("Error: "+e.getMessage());
    }
  }
  public static void method2(){
    method1();
  }
  public static void main(String[] args) {
    method2();
    System.out.println("Handled exception in main");
  }
}
