import java.util.Scanner;

public class nested_tryCatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input array size :");
    int n = sc.nextInt();
    int[] arr = new int[n];

    try {
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("Input idx: ");
      int idx = sc.nextInt();
      
      System.out.println(arr[idx]);

      try {
        System.out.println("Input divisor: ");
        int divisor = sc.nextInt();
        System.out.println(arr[idx] / divisor);

      } catch (ArithmeticException e) {
        System.err.println("Cannot divide by zero!");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Invalid array index!");
    }
  }
}
