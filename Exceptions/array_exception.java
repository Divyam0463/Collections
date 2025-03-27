public class array_exception {
  public static void checkArray(int [] arr , int idx){
    try {
      System.out.println(arr[idx]);
      System.out.println("\n Executed Successfully");
    } catch (ArrayIndexOutOfBoundsException e) {  
      System.out.println("Invalid index!");
    }
    catch(NullPointerException e){
      System.out.println("Array is not initialized!");
    }
  }
  public static void main(String[] args) {
    int [] arr = null ; 
    int idx = 1 ;
    checkArray(arr, idx);
  }
}
