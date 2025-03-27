class InvalidAgeException extends Exception {

  //for creating a user-defined exception, we need to create a class of its name extending exception 
  public InvalidAgeException(String message) {
    super(message);
  }

}

public class custom_age {
  public static void validateAge(int age) throws InvalidAgeException {
    if (age<18) {
      throw new InvalidAgeException("age must be 18 or greater.") ; 
    }
    System.out.println("age is fine: "+age);  
  }

  public static void main(String[] args) {
    //all the exceptions are handled in this way
    try {
      validateAge(122) ;    
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }
  }
}
